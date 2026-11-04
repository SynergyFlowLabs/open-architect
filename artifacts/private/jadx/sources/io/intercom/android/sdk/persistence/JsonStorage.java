package io.intercom.android.sdk.persistence;

import androidx.annotation.m1;
import com.google.gson.f;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.IoUtils;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class JsonStorage {
    private static final Twig TWIG = LumberMill.getLogger();
    private final f gson;

    public interface LoadFailureHandler {
        public static final LoadFailureHandler NONE = new LoadFailureHandler() { // from class: io.intercom.android.sdk.persistence.JsonStorage.LoadFailureHandler.1
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadFailureHandler
            public void onLoadFailed(File file, Exception exc) {
            }
        };

        void onLoadFailed(File file, Exception exc);
    }

    public interface LoadHandler<T> {
        void onLoad(T t10);
    }

    public JsonStorage(f fVar) {
        this.gson = fVar;
    }

    @m1
    public int getDirectoryFileCount(File file) {
        String[] list = file.list();
        if (list == null) {
            return 0;
        }
        return list.length;
    }

    @m1
    public <T> void loadFilesInDirectory(File file, Class<T> cls, LoadHandler<List<T>> loadHandler) throws Throwable {
        loadFilesInDirectory(file, cls, loadHandler, LoadFailureHandler.NONE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m1
    public <T> void loadThenDelete(File file, Class<T> cls, LoadHandler<T> loadHandler) {
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                loadHandler.onLoad(this.gson.o(fileReader2, cls));
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader2);
            } catch (Exception unused) {
                fileReader = fileReader2;
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader);
            } catch (Throwable th2) {
                th = th2;
                fileReader = fileReader2;
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @m1
    public void saveToFileAsJson(Object obj, File file) {
        FileWriter fileWriter = null;
        try {
            try {
                if (file.exists() && !file.delete()) {
                    throw new RuntimeException("Couldn't delete existing file at " + file.getAbsolutePath());
                }
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    throw new RuntimeException("Couldn't create missing parent dir at " + parentFile.getAbsolutePath());
                }
                FileWriter fileWriter2 = new FileWriter(file);
                try {
                    this.gson.H(obj, fileWriter2);
                    IoUtils.closeQuietly(fileWriter2);
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    TWIG.internal("Couldn't save file to disk: " + e);
                    IoUtils.closeQuietly(fileWriter);
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    IoUtils.closeQuietly(fileWriter);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @m1
    public <T> void loadFilesInDirectory(File file, Class<T> cls, LoadHandler<List<T>> loadHandler, LoadFailureHandler loadFailureHandler) throws Throwable {
        FileReader fileReader;
        Exception e10;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        FileReader fileReader2 = null;
        for (File file2 : fileArrListFiles) {
            try {
                fileReader = new FileReader(file2);
                try {
                    try {
                        arrayList.add(this.gson.o(fileReader, cls));
                    } catch (Throwable th2) {
                        th = th2;
                        fileReader2 = fileReader;
                        IoUtils.closeQuietly(fileReader2);
                        throw th;
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    loadFailureHandler.onLoadFailed(file2, e10);
                }
            } catch (Exception e12) {
                fileReader = fileReader2;
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
            }
            IoUtils.closeQuietly(fileReader);
            fileReader2 = fileReader;
        }
        loadHandler.onLoad(arrayList);
    }
}
