package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes14.dex */
public interface n extends FileFilter, FilenameFilter {
    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);
}
