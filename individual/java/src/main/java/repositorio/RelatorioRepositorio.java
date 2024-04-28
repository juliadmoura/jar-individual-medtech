package repositorio;

import modelo.Computador;
import org.springframework.jdbc.core.JdbcTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RelatorioRepositorio {
    private final JdbcTemplate conn;


    public RelatorioRepositorio(JdbcTemplate conn) {
        this.conn = conn;
    }

    public void criarRelatorio(String titulo, Computador computador){
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dataHoraAtual);

        String textoRelatorio = "O computador " + computador.getNome() + " acessou a rede social " + titulo +
                " em " + data;

        conn.execute("insert into relatorio (dataRelatorio, descricao, fkComputador) values ('" + data + "','" + textoRelatorio + "'," + computador.getIdComputador()+ ")");
    }
}
