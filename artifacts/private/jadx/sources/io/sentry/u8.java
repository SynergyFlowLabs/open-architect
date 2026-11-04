package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class u8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f306935b = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f306936a;

    public u8(@NotNull n8 n8Var) {
        this.f306936a = n8Var;
    }

    public static /* synthetic */ boolean b(io.sentry.protocol.z zVar) {
        String strG = zVar.G();
        boolean z10 = false;
        if (strG != null && (strG.startsWith("sun.") || strG.startsWith("java.") || strG.startsWith("android.") || strG.startsWith("com.android."))) {
            z10 = true;
        }
        return !z10;
    }

    @lm.a.c
    @NotNull
    public List<io.sentry.protocol.z> c() {
        return d(new Exception());
    }

    @NotNull
    List<io.sentry.protocol.z> d(@NotNull Throwable th2) {
        List<io.sentry.protocol.z> listE = e(th2.getStackTrace(), false);
        if (listE == null) {
            return Collections.EMPTY_LIST;
        }
        List<io.sentry.protocol.z> listB = io.sentry.util.d.b(listE, new io.sentry.util.d.b() { // from class: io.sentry.s8
            @Override // io.sentry.util.d.b
            public final boolean test(Object obj) {
                return Boolean.TRUE.equals(((io.sentry.protocol.z) obj).P());
            }
        });
        return !listB.isEmpty() ? listB : io.sentry.util.d.b(listE, new io.sentry.util.d.b() { // from class: io.sentry.t8
            @Override // io.sentry.util.d.b
            public final boolean test(Object obj) {
                return u8.b((io.sentry.protocol.z) obj);
            }
        });
    }

    @Nullable
    public List<io.sentry.protocol.z> e(@Nullable StackTraceElement[] stackTraceElementArr, boolean z10) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z10 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.z zVar = new io.sentry.protocol.z();
                    zVar.Z(f(className));
                    zVar.d0(className);
                    zVar.X(stackTraceElement.getMethodName());
                    zVar.V(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        zVar.b0(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    zVar.e0(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(zVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    @Nullable
    public Boolean f(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            Iterator<String> it = this.f306936a.getInAppIncludes().iterator();
            while (it.hasNext()) {
                if (str.startsWith(it.next())) {
                    return Boolean.TRUE;
                }
            }
            Iterator<String> it2 = this.f306936a.getInAppExcludes().iterator();
            while (it2.hasNext()) {
                if (str.startsWith(it2.next())) {
                    return Boolean.FALSE;
                }
            }
            return null;
        }
        return Boolean.TRUE;
    }
}
