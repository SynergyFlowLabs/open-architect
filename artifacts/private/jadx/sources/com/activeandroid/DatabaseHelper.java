package com.activeandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.annotation.m1;
import com.activeandroid.util.NaturalOrderComparator;
import com.activeandroid.util.SQLiteUtils;
import com.activeandroid.util.SqlParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.p;

/* JADX INFO: loaded from: classes3.dex */
public final class DatabaseHelper extends SQLiteOpenHelper {
    public static final String MIGRATION_PATH = "migrations";
    private int downgradedFrom;
    private final String mSqlParser;

    @m1
    public DatabaseHelper(Configuration configuration) {
        super(configuration.getContext(), configuration.getDatabaseName(), (SQLiteDatabase.CursorFactory) null, configuration.getDatabaseVersion());
        this.downgradedFrom = 0;
        copyAttachedDatabase(configuration.getContext(), configuration.getDatabaseName());
        this.mSqlParser = configuration.getSqlParser();
    }

    @m1
    private void executeCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            Iterator<TableInfo> it = Cache.getTableInfos().iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(SQLiteUtils.createTableDefinition(it.next()));
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }

    @m1
    private void executeCreateIndex(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            Iterator<TableInfo> it = Cache.getTableInfos().iterator();
            while (it.hasNext()) {
                for (String str : SQLiteUtils.createIndexDefinition(it.next())) {
                    sQLiteDatabase.execSQL(str);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }

    @m1
    private void executeDelimitedSqlScript(SQLiteDatabase sQLiteDatabase, InputStream inputStream) throws IOException {
        Iterator<String> it = SqlParser.parse(inputStream).iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(it.next());
        }
    }

    @m1
    private void executeLegacySqlScript(SQLiteDatabase sQLiteDatabase, InputStream inputStream) throws Throwable {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        Throwable th2;
        try {
            inputStreamReader = new InputStreamReader(inputStream);
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            p.m(bufferedReader);
                            p.m(inputStreamReader);
                            return;
                        } else {
                            String strTrim = line.replace(";", "").trim();
                            if (!TextUtils.isEmpty(strTrim)) {
                                sQLiteDatabase.execSQL(strTrim);
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        p.m(bufferedReader);
                        p.m(inputStreamReader);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                th2 = th;
                p.m(bufferedReader);
                p.m(inputStreamReader);
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            inputStreamReader = null;
        }
    }

    @m1
    private boolean executeMigrations(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        boolean z10 = false;
        try {
            List<String> listAsList = Arrays.asList(Cache.getContext().getAssets().list(MIGRATION_PATH));
            Collections.sort(listAsList, new NaturalOrderComparator());
            sQLiteDatabase.beginTransaction();
            try {
                for (String str : listAsList) {
                    try {
                        int iIntValue = Integer.valueOf(str.replace(".sql", "")).intValue();
                        if (iIntValue > i10 && iIntValue <= i11) {
                            executeSqlScript(sQLiteDatabase, str);
                            z10 = true;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabase.endTransaction();
                throw th2;
            }
        } catch (IOException unused2) {
        }
        return z10;
    }

    @m1
    private void executePragmas(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
    }

    @m1
    private void executeSqlScript(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            InputStream inputStreamOpen = Cache.getContext().getAssets().open("migrations/" + str);
            if (Configuration.SQL_PARSER_DELIMITED.equalsIgnoreCase(this.mSqlParser)) {
                executeDelimitedSqlScript(sQLiteDatabase, inputStreamOpen);
            } else {
                executeLegacySqlScript(sQLiteDatabase, inputStreamOpen);
            }
            p.k(inputStreamOpen);
        } catch (IOException unused) {
            p.k(null);
        } catch (Throwable th2) {
            p.k(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005e A[Catch: FileNotFoundException | IOException -> 0x0062, FileNotFoundException | IOException -> 0x0062, TRY_LEAVE, TryCatch #1 {FileNotFoundException | IOException -> 0x0062, blocks: (B:6:0x0016, B:33:0x005b, B:33:0x005b, B:31:0x0057, B:31:0x0057, B:35:0x005e, B:35:0x005e), top: B:39:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    @m1
    public void copyAttachedDatabase(Context context, String str) {
        File databasePath = context.getDatabasePath(str);
        if (databasePath.exists()) {
            return;
        }
        databasePath.getParentFile().mkdirs();
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(databasePath);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = inputStreamOpen.read(bArr, 0, 8192);
                        if (i10 <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i10);
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException unused) {
            } catch (Throwable th4) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
        } catch (FileNotFoundException | IOException unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (this.downgradedFrom == 0) {
            return writableDatabase;
        }
        try {
            writableDatabase.beginTransaction();
            writableDatabase.setVersion(this.downgradedFrom);
            writableDatabase.setTransactionSuccessful();
            this.downgradedFrom = 0;
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        executePragmas(sQLiteDatabase);
        executeCreate(sQLiteDatabase);
        int i10 = 4 | (-1);
        executeMigrations(sQLiteDatabase, -1, sQLiteDatabase.getVersion());
        executeCreateIndex(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.downgradedFrom = i10;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        executePragmas(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        executePragmas(sQLiteDatabase);
        executeCreate(sQLiteDatabase);
        executeMigrations(sQLiteDatabase, i10, i11);
    }
}
