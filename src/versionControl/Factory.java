package versioncontrol;

public class Factory {

    public static VersionControl GetSnapShot(String typeFile){

        switch(typeFile) {
            case "EXPORT":
                return new Export();
            case "VERSION":
                return new DatabaseVersionControl();
        }


        return null;


    }
}
