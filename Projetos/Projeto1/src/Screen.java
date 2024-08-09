import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {

    private JTextField text; // Campo de texto para entrada do usuário

    public Screen() {
        // Configura o JFrame
        setTitle("Sistema de Chamados"); // Título da janela
        setSize(800, 600); // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o aplicativo ao fechar a janela
        setResizable(false); // Impede o redimensionamento da janela
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setLayout(null); // Usa layout absoluto

        // Cria e configura o botão "Enviar Chamado"
        JButton btnEnviar = new JButton("Enviar Chamado");
        btnEnviar.setBounds(50, 50, 150, 50); // Define a posição e tamanho do botão
        btnEnviar.setFont(new Font("Arial", Font.BOLD, 12)); // Define a fonte do botão
        btnEnviar.setForeground(Color.BLACK); // Define a cor do texto do botão
        btnEnviar.setBackground(Color.GREEN); // Define a cor de fundo do botão

        // Cria e configura o botão "Anexar Arquivo"
        JButton btnAnexo = new JButton("Anexar Arquivo");
        btnAnexo.setBounds(50, 120, 150, 50); // Define a posição e tamanho do botão
        btnAnexo.setFont(new Font("Arial", Font.BOLD, 12)); // Define a fonte do botão
        btnAnexo.setForeground(Color.BLACK); // Define a cor do texto do botão
        btnAnexo.setBackground(Color.YELLOW); // Define a cor de fundo do botão

        // Adiciona os botões ao JFrame
        add(btnEnviar);
        add(btnAnexo);

        // Cria e configura o campo de texto
        text = new JTextField("Ocorrencia");
        text.setBounds(200, 200, 200, 100); // Define a posição e tamanho do campo de texto
        text.setFont(new Font("Arial", Font.BOLD, 12)); // Define a fonte do campo de texto

        // Adiciona o campo de texto ao JFrame
        add(text);

        // Adiciona os ouvintes de ação aos botões
        btnEnviar.addActionListener(this::enviar);
        btnAnexo.addActionListener(this::anexo);

        // Torna o JFrame visível após adicionar todos os componentes
        setVisible(true);
    }

    // Método chamado quando o botão "Enviar Chamado" é clicado
    private void enviar(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(
                this, // Define o JFrame como o pai do JOptionPane
                "Enviado com sucesso", // Mensagem exibida
                "Sistema de Chamado", // Título da caixa de diálogo
                JOptionPane.INFORMATION_MESSAGE // Tipo de mensagem
        );
    }

    // Método chamado quando o botão "Anexar Arquivo" é clicado
    private void anexo(ActionEvent actionEvent) {
        // Obtém o texto do campo de texto e o exibe em uma caixa de diálogo
        JOptionPane.showMessageDialog(
                this,
                text.getText(),
                "Anexar Documento",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implementar se necessário para responder a eventos de ação adicionais
    }
}
