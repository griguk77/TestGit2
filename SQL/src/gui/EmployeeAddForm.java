package gui;
import controller.Controller;
import model.Employee;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;

public class EmployeeAddForm extends Container {
    private JPanel employeeAddPanel;
    private JTextField nameTextField;
    private JTextField depTextField;
    private JTextField ageTextField;
    private JTextField phoneTextField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton otherRadioButton;
    private JLabel nameLabel;
    private JLabel depLabel;
    private JLabel ageLabel;
    private JLabel phoneLabel;
    private JLabel positionLabel;
    private JComboBox positionComboBox;
    private JLabel genderLabel;
    //private JButton addButton;
    private ButtonGroup genderGroup;
    private Controller controller;

    public EmployeeAddForm() {
        $$$setupUI$$$();
        controller = new Controller();
    }

    public void addDataToDB() {
        boolean validInput = true;
        String errMessage = "Incorrect values in input fields: \n";

        String nameText = nameTextField.getText();
        if (nameText.isEmpty()) {
            errMessage = errMessage + "\"Name\" fields is empty \n";
            validInput = false;
        }

        String depText = depTextField.getText();
        if (depText.isEmpty()) {
            errMessage = errMessage + "\"Department\" fields is empty \n";
            validInput = false;
        }

        int age = 0;
        try {
            age = Integer.parseInt(ageTextField.getText());
        } catch (NumberFormatException ne) {
            errMessage = errMessage + "\"Age\" field has incorrect value \n" + ne.getMessage() + "\n";
            validInput = false;
        }

        String phone = phoneTextField.getText();
        if (phone.isEmpty()) {
            errMessage = errMessage + "\"Phone\" field is empty \n";
            validInput = false;
        }

        String position = (String) positionComboBox.getSelectedItem();

        String gender = genderGroup.getSelection().getActionCommand();

        if (!validInput) {
            JOptionPane.showMessageDialog(new JFrame(), errMessage, "Input Information Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Employee employee = new Employee(nameText, depText, age, phone, position, gender);
        controller.addEmployee(employee);

        JOptionPane.showMessageDialog(new JFrame(), employee.toString(), "Input Information OK", JOptionPane.INFORMATION_MESSAGE);
    }

    /*public EmployeeAddForm() {
        $$$setupUI$$$();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean validInput = true;
                String errMessage = "Incorrect values in input fields: \n";

                String nameText = nameTextField.getText();
                if (nameText.isEmpty()) {
                    errMessage = errMessage + "\"Name\" field is empty \n";
                    validInput = false;
                }

                String depText = depTextField.getText();
                if (depText.isEmpty()) {
                    errMessage = errMessage + "\"Department\" field is empty \n";
                    validInput = false;
                }

                int age = 0;
                try {
                    age = Integer.parseInt(ageTextField.getText());
                } catch (NumberFormatException ne) {
                    errMessage = errMessage + "\"Age\" field has incorrect value \n" + ne.getMessage();
                    validInput = false;
                }

                String phone = phoneTextField.getText();
                if (phone.isEmpty()) {
                    errMessage = errMessage + "\"Phone\" field is empty \n";
                    validInput = false;
                }

                String position = (String) positionComboBox.getSelectedItem();

                String gender = genderGroup.getSelection().getActionCommand();
                //errMessage = errMessage + "Gender: " + gender;

                if (!validInput) {
                    JOptionPane.showMessageDialog(new JFrame(), errMessage, "Input Information Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Employee employee = new Employee(nameText, depText, age, phone, position, gender);
                Controller controller = new Controller();
                controller.addEmployee(employee);

                JOptionPane.showMessageDialog(new JFrame(), employee.toString(), "Input Information OK", JOptionPane.INFORMATION_MESSAGE);


                String message = "Message text";
                JOptionPane.showMessageDialog(new JFrame(), message, "Windows title", JOptionPane.ERROR_MESSAGE);
            }
        });
    }*/

    public JPanel getEmployeeAddPanel() {
        return employeeAddPanel;
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        employeeAddPanel = new JPanel();
        employeeAddPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(9, 2, new Insets(0, 0, 0, 0), -1, -1));
        nameLabel = new JLabel();
        nameLabel.setText("Name:");
        employeeAddPanel.add(nameLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nameTextField = new JTextField();
        employeeAddPanel.add(nameTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        employeeAddPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        depLabel = new JLabel();
        depLabel.setText("Department:");
        employeeAddPanel.add(depLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        depTextField = new JTextField();
        employeeAddPanel.add(depTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        ageLabel = new JLabel();
        ageLabel.setText("Age:");
        employeeAddPanel.add(ageLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        employeeAddPanel.add(ageTextField, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        phoneLabel = new JLabel();
        phoneLabel.setText("Phone:");
        employeeAddPanel.add(phoneLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        employeeAddPanel.add(phoneTextField, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        positionLabel = new JLabel();
        positionLabel.setText("Position:");
        employeeAddPanel.add(positionLabel, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        genderLabel = new JLabel();
        genderLabel.setText("Gender");
        employeeAddPanel.add(genderLabel, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        maleRadioButton = new JRadioButton();
        maleRadioButton.setSelected(false);
        maleRadioButton.setText("Male");
        employeeAddPanel.add(maleRadioButton, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        femaleRadioButton = new JRadioButton();
        femaleRadioButton.setText("Female");
        employeeAddPanel.add(femaleRadioButton, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        otherRadioButton = new JRadioButton();
        otherRadioButton.setText("Other");
        employeeAddPanel.add(otherRadioButton, new com.intellij.uiDesigner.core.GridConstraints(7, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        positionComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Trainee");
        defaultComboBoxModel1.addElement("Junior");
        defaultComboBoxModel1.addElement("Middle");
        defaultComboBoxModel1.addElement("Senior");
        defaultComboBoxModel1.addElement("Lead");
        defaultComboBoxModel1.addElement("Head");
        defaultComboBoxModel1.addElement("PM");
        positionComboBox.setModel(defaultComboBoxModel1);
        employeeAddPanel.add(positionComboBox, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        genderGroup.add(otherRadioButton);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return employeeAddPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        /*maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        otherRadioButton = new JRadioButton("Other");

        maleRadioButton.setActionCommand("Male");
        femaleRadioButton.setActionCommand("Female");
        otherRadioButton.setActionCommand("Other");*/

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(0);
        nf.setMaximumIntegerDigits(10);

        ageTextField = new JFormattedTextField(nf);

        MaskFormatter phoneMask = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a placeholder
            // character
            phoneMask = new MaskFormatter("+7 (###) ###-####");
            phoneMask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }

        phoneTextField = new JFormattedTextField(phoneMask);
    }
}
