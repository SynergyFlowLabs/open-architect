package io.sentry.android.ndk;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.l1;
import io.sentry.m1;
import io.sentry.n8;
import io.sentry.ndk.NativeModuleListLoader;
import io.sentry.protocol.DebugImage;
import io.sentry.util.y;
import io.sentry.y7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lm.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile List<DebugImage> f304634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    protected static final io.sentry.util.a f304635d = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f304636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final NativeModuleListLoader f304637b;

    public b(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull NativeModuleListLoader nativeModuleListLoader) {
        this.f304636a = (n8) y.c(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f304637b = (NativeModuleListLoader) y.c(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }

    @NotNull
    private Set<DebugImage> d(@NotNull List<DebugImage> list, @NotNull Set<String> set) {
        long jLongValue;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < list.size()) {
            DebugImage debugImage = list.get(i10);
            i10++;
            DebugImage debugImage2 = i10 < list.size() ? list.get(i10) : null;
            String imageAddr = debugImage2 != null ? debugImage2.getImageAddr() : null;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                try {
                    long j10 = Long.parseLong(it.next().replace("0x", ""), 16);
                    String imageAddr2 = debugImage.getImageAddr();
                    if (imageAddr2 != null) {
                        long j11 = Long.parseLong(imageAddr2.replace("0x", ""), 16);
                        Long imageSize = debugImage.getImageSize();
                        if (imageSize != null) {
                            jLongValue = imageSize.longValue() + j11;
                        } else {
                            jLongValue = imageAddr != null ? Long.parseLong(imageAddr.replace("0x", ""), 16) : Long.MAX_VALUE;
                        }
                        if (j10 >= j11 && j10 < jLongValue) {
                            hashSet.add(debugImage);
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return hashSet;
    }

    @Override // io.sentry.android.core.l1
    @Nullable
    public Set<DebugImage> a(@NotNull Set<String> set) {
        m1 m1VarA = f304635d.a();
        try {
            List<DebugImage> listB = b();
            if (listB == null) {
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
            if (set.isEmpty()) {
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
            Set<DebugImage> setD = d(listB, set);
            if (!setD.isEmpty()) {
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return setD;
            }
            this.f304636a.getLogger().c(y7.WARNING, "No debug images found for any of the %d addresses.", Integer.valueOf(set.size()));
            if (m1VarA != null) {
                m1VarA.close();
            }
            return null;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.l1
    @Nullable
    public List<DebugImage> b() {
        m1 m1VarA = f304635d.a();
        try {
            if (f304634c == null) {
                try {
                    io.sentry.ndk.DebugImage[] debugImageArrB = this.f304637b.b();
                    if (debugImageArrB != null) {
                        f304634c = new ArrayList(debugImageArrB.length);
                        for (io.sentry.ndk.DebugImage debugImage : debugImageArrB) {
                            DebugImage debugImage2 = new DebugImage();
                            debugImage2.setCodeFile(debugImage.getCodeFile());
                            debugImage2.setDebugFile(debugImage.getDebugFile());
                            debugImage2.setUuid(debugImage.getUuid());
                            debugImage2.setType(debugImage.getType());
                            debugImage2.setDebugId(debugImage.getDebugId());
                            debugImage2.setCodeId(debugImage.getCodeId());
                            debugImage2.setImageAddr(debugImage.getImageAddr());
                            debugImage2.setImageSize(debugImage.getImageSize());
                            debugImage2.setArch(debugImage.getArch());
                            f304634c.add(debugImage2);
                        }
                        this.f304636a.getLogger().c(y7.DEBUG, "Debug images loaded: %d", Integer.valueOf(f304634c.size()));
                    }
                } catch (Throwable th2) {
                    this.f304636a.getLogger().b(y7.ERROR, th2, "Failed to load debug images.", new Object[0]);
                }
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
            return f304634c;
        } catch (Throwable th3) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.android.core.l1
    public void c() {
        m1 m1VarA = f304635d.a();
        try {
            try {
                this.f304637b.a();
                this.f304636a.getLogger().c(y7.INFO, "Debug images cleared.", new Object[0]);
            } catch (Throwable th2) {
                this.f304636a.getLogger().b(y7.ERROR, th2, "Failed to clear debug images.", new Object[0]);
            }
            f304634c = null;
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th3) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @r
    @Nullable
    List<DebugImage> e() {
        return f304634c;
    }
}
