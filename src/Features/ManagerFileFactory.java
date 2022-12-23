package Features;

public class ManagerFileFactory {
    public ManagingFile getOperationType(String operationType){

        switch(operationType) {
            case "IMPORT":
                return (ManagingFile) new ImportFile();
            case "EXPORT":
                return (ManagingFile) new ExportFile();
            case "DELETE":
                return (ManagingFile) new DeleteFile();
        }
        return null;
    }
}