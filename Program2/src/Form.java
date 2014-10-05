import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form extends JFrame {
    private int voron = 0;
    private JLabel countLabel;
    private JButton addCrow;
    private JButton removeCrow;

    public Form() {
        super("Crow calculator");
        setBounds(100, 100, 500, 200);
        //Подготавливаем компоненты объекта
        countLabel = new JLabel("Crows:" + voron);
        addCrow = new JButton("Add Crow");
        removeCrow = new JButton("Remove Crow");

        //Подготавливаем временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        //Расставляем компоненты по местам
        add(countLabel, BorderLayout.NORTH); //О размещении компонент поговорим позже

        buttonsPanel.add(addCrow);
        buttonsPanel.add(removeCrow);

        add(buttonsPanel, BorderLayout.SOUTH);
        addCrow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                voron = voron+1;     //Добавляем одну ворону
                updateCrowCounter(); //Сообщаем приложению, что количество ворон изменилось
            }


        });
        removeCrow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if( voron > 0 ) {
                    voron = voron - 1;
                    updateCrowCounter(); //Сообщаем приложению, что количество ворон изменилось
                }
            }
        });

    }
    private void updateCrowCounter() {
        countLabel.setText("Crows:" + voron);
    }
}