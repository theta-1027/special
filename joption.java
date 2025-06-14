package basicPrograms;
import javax.swing.*;

public class joption {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "💀💀TROJAN HORSE FOUND 💀💀", "virus found", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "💀💀TROJAN HORSE FOUND 💀💀", "virus found", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "💀💀TROJAN HORSE FOUND 💀💀", "virus found", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "💀💀TROJAN HORSE FOUND 💀💀", "virus found", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "💀💀TROJAN HORSE FOUND 💀💀", "virus found", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showConfirmDialog(null, "bro do you even code", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(JOptionPane.showConfirmDialog(null, "bro do you even code", "title", JOptionPane.YES_NO_CANCEL_OPTION));
        int answer = JOptionPane.showConfirmDialog(null, "bro do you even code", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog("whats yo name ::");
        System.out.println(answer);
        System.out.println(name);
        String[] responses = {"no, you are dead", "yes, you are dead"};
        ImageIcon icon = new ImageIcon("brocode.png");
        JOptionPane.showOptionDialog(null,
                "why am i here ",
                "hi bro",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                responses,
                0);

    }
}

