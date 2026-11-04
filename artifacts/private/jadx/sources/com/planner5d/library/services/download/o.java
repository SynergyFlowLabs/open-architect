package com.planner5d.library.services.download;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.i1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDownloadUriManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadUriManager.kt\ncom/planner5d/library/services/download/DownloadUriManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
public final class o implements com.planner5d.library.services.bitmaploader.d.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f224287a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<String, Long> f224288b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f224289c = 8;

    private o() {
    }

    private final g[] e(String[] strArr, String str) {
        if (str == null || strArr == null || strArr.length == 0) {
            return null;
        }
        int length = strArr.length;
        g[] gVarArr = new g[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            gVarArr[i10] = new g(str2, str);
        }
        return gVarArr;
    }

    private final boolean g(String str) {
        Long l10;
        Map<String, Long> map = f224288b;
        synchronized (map) {
            l10 = map.get(str);
        }
        boolean z10 = false;
        if (l10 != null) {
            if (System.currentTimeMillis() - l10.longValue() < 900000) {
                z10 = true;
            }
        }
        return z10;
    }

    private final <T> T h(g[] gVarArr, c2 c2Var, i1 i1Var, Context context, l<T> lVar) throws Throwable {
        if (gVarArr == null || gVarArr.length == 0) {
            throw new i();
        }
        boolean zD = c2Var.d(context);
        Iterator itA = kotlin.jvm.internal.i.a(gVarArr);
        Throwable th2 = null;
        while (itA.hasNext()) {
            g gVar = (g) itA.next();
            if (zD) {
                try {
                    if (this.g(gVar.a())) {
                        continue;
                    }
                } catch (k e10) {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (new NetworkErrorUtility(i1Var).isNetworkBehindGreatWall(context, th2)) {
                        this.i(gVar.a());
                    }
                }
            }
            return lVar.a(gVar);
        }
        if (th2 != null) {
            timber.log.b.f381052a.y(th2);
        }
        if (th2 == null) {
            throw new j();
        }
        throw new h(th2);
    }

    private final void i(String str) {
        Map<String, Long> map = f224288b;
        synchronized (map) {
            try {
                map.put(str, Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.services.bitmaploader.d.g
    public <T> T a(@NotNull Context context, @Nullable g[] gVarArr, @NotNull l<T> loader, @NotNull c2 networkStateUtility, @NotNull i1 internetStateMonitor) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(internetStateMonitor, "internetStateMonitor");
        return (T) h(gVarArr, networkStateUtility, internetStateMonitor, context, loader);
    }

    public final void b() {
        Map<String, Long> map = f224288b;
        synchronized (map) {
            try {
                map.clear();
                Unit unit = Unit.f312394a;
            } finally {
            }
        }
    }

    @Nullable
    public final g[] c(@Nullable com.planner5d.library.model.d dVar, @Nullable String str) {
        return d(dVar, str, null);
    }

    @Nullable
    public final g[] d(@Nullable com.planner5d.library.model.d dVar, @Nullable String str, @Nullable String[] strArr) {
        if (dVar != null) {
            strArr = dVar.f180679c;
        }
        return e(strArr, str);
    }

    public final int f() {
        int size;
        Map<String, Long> map = f224288b;
        synchronized (map) {
            size = map.size();
        }
        return size;
    }
}
