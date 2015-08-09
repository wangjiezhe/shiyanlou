import os
import multiprocessing as mul
import time


def inputQ(queue):
    info = str(os.getpid()) + '(put):' + str(time.time())
    queue.put(info)


def outputQ(queue, lock):
    info = queue.get()
    lock.acquire()
    print(str(os.getpid()) + '(get):' + info)
    lock.release()


# Main
record1 = []
record2 = []
lock = mul.Lock()
queue = mul.Queue(3)

# input process
for i in range(10):
    process = mul.Process(target=inputQ, args=(queue,))
    process.start()
    record1.append(process)

# output process
for i in range(10):
    process = mul.Process(target=outputQ, args=(queue, lock))
    process.start()
    record2.append(process)

for p in record1:
    p.join()

queue.close()

for p in record2:
    p.join()
