package commands;

import exceptions.FileReadPermissionException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;

public class FileManager {
    private final File file;

    public FileManager(File file) throws FileNotFoundException {
        this.file = file;
        if (!file.exists()) {
            throw new FileNotFoundException("Файла с таким названием не существует");
        }
        if (file.exists() && file.isDirectory()) {
            throw new FileNotFoundException("По введенному пути находится директория, а не файл");
        }
        if (!file.canRead()) {
            throw new FileReadPermissionException("Нет прав для чтения файла");
        }
    }
public Hashtable<String, Integer> filetoStringHashtable() throws FileNotFoundException{

}

}
