package com.segment.analytics.kotlin.core.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEventStream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventStream.kt\ncom/segment/analytics/kotlin/core/utilities/FileEventStream\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,251:1\n26#2:252\n11335#3:253\n11670#3,3:254\n*S KotlinDebug\n*F\n+ 1 EventStream.kt\ncom/segment/analytics/kotlin/core/utilities/FileEventStream\n*L\n206#1:252\n206#1:253\n206#1:254,3\n*E\n"})
public class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f267003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private FileOutputStream f267004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private File f267005c;

    public static final class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws IOException {
            FileOutputStream fileOutputStreamG = j.this.g();
            if (fileOutputStreamG != null) {
                fileOutputStreamG.close();
            }
        }
    }

    public j(@NotNull File directory) throws IOException {
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f267003a = directory;
        k.a(directory);
        h();
    }

    private final void h() {
        Runtime.getRuntime().addShutdownHook(new a());
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public void a(@Nullable Function1<? super String, String> function1) throws IOException {
        FileOutputStream fileOutputStreamG = g();
        if (fileOutputStreamG != null) {
            fileOutputStreamG.close();
        }
        j(null);
        File fileE = e();
        if (fileE != null && function1 != null) {
            File file = this.f267003a;
            String name = fileE.getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            fileE.renameTo(new File(file, function1.invoke(name)));
        }
        i(null);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    @Nullable
    public InputStream b(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        File file = new File(source);
        if (file.exists()) {
            return new FileInputStream(file);
        }
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public boolean c() {
        return (e() == null || g() == null) ? false : true;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public void close() throws IOException {
        FileOutputStream fileOutputStreamG = g();
        if (fileOutputStreamG != null) {
            fileOutputStreamG.close();
        }
        j(null);
        i(null);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public boolean d(@NotNull String file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        File fileE = e();
        boolean z10 = false;
        if (fileE != null) {
            String name = fileE.getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            if (!StringsKt.M1(name, file, false, 2, null)) {
                close();
            }
        }
        if (e() == null) {
            i(new File(this.f267003a, file));
        }
        File fileE2 = e();
        if (fileE2 != null) {
            if (!fileE2.exists()) {
                fileE2.createNewFile();
                z10 = true;
            }
            FileOutputStream fileOutputStreamG = g();
            if (fileOutputStreamG == null) {
                fileOutputStreamG = new FileOutputStream(fileE2, true);
            }
            j(fileOutputStreamG);
        }
        return z10;
    }

    @Nullable
    protected File e() {
        return this.f267005c;
    }

    @NotNull
    public final File f() {
        return this.f267003a;
    }

    @Nullable
    protected FileOutputStream g() {
        return this.f267004b;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public long getLength() {
        File fileE = e();
        if (fileE != null) {
            return fileE.length();
        }
        return 0L;
    }

    protected void i(@Nullable File file) {
        this.f267005c = file;
    }

    protected void j(@Nullable FileOutputStream fileOutputStream) {
        this.f267004b = fileOutputStream;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    @NotNull
    public List<String> read() {
        File[] fileArrListFiles = this.f267003a.listFiles();
        int i10 = 4 << 0;
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public void remove(@NotNull String file) {
        Intrinsics.checkNotNullParameter(file, "file");
        new File(file).delete();
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public void write(@NotNull String content) throws IOException {
        Intrinsics.checkNotNullParameter(content, "content");
        FileOutputStream fileOutputStreamG = g();
        if (fileOutputStreamG != null) {
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStreamG.write(bytes);
            fileOutputStreamG.flush();
        }
    }
}
