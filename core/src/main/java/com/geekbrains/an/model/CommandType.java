package com.geekbrains.an.model;

public enum CommandType {
    AUTH,
    AUTH_OK,
    AUTH_FAIL,
    REGISTER,
    REGISTER_OK,
    REGISTER_FAIL,
    FILE,
    FILE_REQUEST,
    LIST,
    IN_DIRECTORY,
    UP_DIRECTORY,
    SERVER_HOME_CLIK,
    DELETE,
    CREATE_FOLDER,
    PASTE_FILE,
    RENAME;
}
