package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarRegistro {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome que deseja Colocar");
        String nome = entrada.nextLine();
        System.out.print("Informe o Código da Pessoa: \n");
        int codigo = entrada.nextInt();


        Connection conexao = FabricaConexao.getConexao();

        String sql = """
                update pessoas
                set nome = ?
                where codigo = ?
                """;

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome );
        stmt.setString(2, String.valueOf(codigo));
        stmt.execute();
        System.out.println("Pessoa atualizada com Sucesso");

        conexao.close();
        entrada.close();
    }
}
