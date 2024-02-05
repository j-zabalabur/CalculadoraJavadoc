package formatoLogs;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class FormatoLogs extends Formatter {
	@Override
	public String format(LogRecord record) {
		String mensaje=record.getMessage();
		String[] trozos=mensaje.split(",");
		System.out.println(record.getLevel());
		if (record.getLevel()==Level.WARNING) {
		return "<tr>\r\n"
				+ "				<td>"+"WARNING"+"</td>\r\n"
				+ "				<td>"+"Division/Resto"+"</td>\r\n"
				+ "				<td>"+"por 0"+"</td>\r\n"
				+ "				<td>"+"ERROR"+"</td>\r\n"
				+ "			</tr>\n";

		}else {
		return "<tr>\r\n"
				+ "				<td>"+trozos[0]+"</td>\r\n"
				+ "				<td>"+trozos[1]+"</td>\r\n"
				+ "				<td>"+trozos[2]+"</td>\r\n"
				+ "				<td>"+trozos[3]+"</td>\r\n"
				+ "			</tr>\n";}
		}

	@Override
	public String getHead(Handler h) {
		return "<html>\r\n"
				+ "	<head>\r\n"
				+ "		<link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "	</head>\r\n"
				+ "	<body>\r\n"
				+ "		<table>\r\n"
				+ "			<tr>\r\n"
				+ "				<th>Operación</th>\r\n"
				+ "				<th>Operando 1</th>				\r\n"
				+ "				<th>Operando 2</th>\r\n"
				+ "				<th>Resultado</th>\r\n"
				+ "			</tr>\n";
	}

	@Override
	public String getTail(Handler h) {
		return "		</table>\r\n"
				+ "	</body>\r\n"
				+ "</html>\n";
	}
}