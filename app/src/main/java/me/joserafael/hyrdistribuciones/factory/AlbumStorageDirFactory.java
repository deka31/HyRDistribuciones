package me.joserafael.hyrdistribuciones.factory;

import java.io.File;

public abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}