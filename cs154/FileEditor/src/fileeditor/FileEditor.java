package fileeditor;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class FileEditor extends JFrame {
    private JTextField selectField;
    private JTextArea editArea;

    private int level = 0;

    private FileEditor() {
        this.setTitle("Editor");
        this.setBounds(300, 50, 600, 650);

        selectField = new JTextField(40);
        JButton openFileBtn = new JButton("Browse");
        openFileBtn.addActionListener(actionEvent -> {
            FileEditor.this.level = 0;
            String path = selectField.getText();
            openDirOrFile(path);
        });

        JPanel upPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        upPanel.setBackground(Color.cyan);
        upPanel.add(selectField);
        upPanel.add(openFileBtn);
        this.add(upPanel, BorderLayout.NORTH);

        editArea = new JTextArea();
        ScrollPane scrollPanel = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
        scrollPanel.add(editArea);
        this.add(scrollPanel, BorderLayout.CENTER);

        JButton saveBtn = new JButton("Save");
        saveBtn.addActionListener(actionEvent -> saveFile());

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.green);
        southPanel.add(saveBtn);
        this.add(southPanel, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void saveFile() {
        FileDialog fd = new FileDialog(this, "Save File");

        fd.setFile("untitled.txt");
        fd.setMode(FileDialog.SAVE);
        fd.setVisible(true);

        String fileName = fd.getFile();
        String dir = fd.getDirectory();
        File newFile = new File(dir + File.separator + fileName);
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(newFile)))) {
            String str = editArea.getText();
            pw.println(str);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openDirOrFile(String absolutePath) {
        File file = new File(absolutePath);

        if (!(file.exists())) {
            editArea.setText("The file does not exist!");
        } else if (file.isDirectory()) {
            editArea.setText(null);
            showDir(file);
        } else if (file.isFile()) {
            try (FileInputStream fis = new FileInputStream(file);
                 BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {
                String str;
                editArea.setText(null);
                while ((str = br.readLine()) != null) {
                    editArea.append(str + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showDir(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file: files) {
                if (file.isDirectory()) {
                    for (int j = 0; j < this.level; j++) {
                        editArea.append("  ");
                    }
                    editArea.append(this.level + 1 + "  +" + file.getName() + " Directory\n");
                    this.level++;
                    showDir(file);
                } else if (file.isFile()) {
                    for (int j = 0; j < this.level+2; j++) {
                        editArea.append(" ");
                    }
                    editArea.append(this.level + " ┝ ┈" + file.getAbsolutePath() + "\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        new FileEditor();
    }
}



















