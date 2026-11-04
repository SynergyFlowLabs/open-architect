package x3;

import androidx.annotation.b1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f390605f = "SupportSQLiteLock";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f390607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final File f390608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Lock f390609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private FileChannel f390610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C2530a f390604e = new C2530a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Map<String, Lock> f390606g = new HashMap();

    /* JADX INFO: renamed from: x3.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,103:1\n361#2,7:104\n*S KotlinDebug\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n*L\n99#1:104,7\n*E\n"})
    public static final class C2530a {
        public /* synthetic */ C2530a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f390606g) {
                try {
                    Map map = a.f390606g;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }

        private C2530a() {
        }
    }

    public a(@NotNull String name, @Nullable File file, boolean z10) {
        File file2;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f390607a = z10;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f390608b = file2;
        this.f390609c = f390604e.b(name);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f390607a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f390609c.lock();
        if (z10) {
            try {
                File file = this.f390608b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f390608b).getChannel();
                channel.lock();
                this.f390610d = channel;
            } catch (IOException unused) {
                this.f390610d = null;
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f390610d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f390609c.unlock();
    }
}
