package patronesddi.Memento.Ejercicio;

import java.util.HashMap;
import java.util.Map;


public class BackupContainer {
    private Map<String, Backup> backups = new HashMap<>();

	public void addBackup(Backup backup) {
		backups.put(backup.getAlias(), backup);
    }

	public Backup getBackup(String alias) {
		Backup backup = backups.get(alias);
		return backup;
	}
}
