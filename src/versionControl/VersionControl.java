
package versioncontrol;

import java.sql.Connection;

public interface VersionControl {

    void Snap(Connection database);
}
