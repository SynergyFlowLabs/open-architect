package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f49534b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final NativeSharedCounter f49535c = new NativeSharedCounter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f49536a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final m0 b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            int fd2 = parcelFileDescriptor.getFd();
            if (c().nativeTruncateFile(fd2) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = c().nativeCreateSharedCounter(fd2);
            if (jNativeCreateSharedCounter >= 0) {
                return new m0(jNativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        @NotNull
        public final m0 a(@NotNull Function0<? extends File> produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            Intrinsics.checkNotNullParameter(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(produceFile.invoke(), 939524096);
                try {
                    m0 m0VarB = b(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return m0VarB;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptorOpen = null;
            }
        }

        @NotNull
        public final NativeSharedCounter c() {
            return m0.f49535c;
        }

        public final void d() {
            System.loadLibrary("datastore_shared_counter");
        }

        private a() {
        }
    }

    public /* synthetic */ m0(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public final int b() {
        return f49535c.nativeGetCounterValue(this.f49536a);
    }

    public final int c() {
        return f49535c.nativeIncrementAndGetCounterValue(this.f49536a);
    }

    private m0(long j10) {
        this.f49536a = j10;
    }
}
