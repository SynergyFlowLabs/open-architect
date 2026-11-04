package io.ktor.http.content;

import io.ktor.http.d1;
import io.ktor.http.v0;
import io.ktor.http.w0;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nVersions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Versions.kt\nio/ktor/http/content/LastModifiedVersion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1761#2,3:308\n1740#2,3:311\n774#2:314\n865#2,2:315\n1617#2,9:317\n1869#2:326\n1870#2:328\n1626#2:329\n1#3:327\n1#3:330\n*S KotlinDebug\n*F\n+ 1 Versions.kt\nio/ktor/http/content/LastModifiedVersion\n*L\n123#1:308,3\n132#1:311,3\n140#1:314\n140#1:315,2\n141#1:317,9\n141#1:326\n141#1:328\n141#1:329\n141#1:327\n*E\n"})
public final class q implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final GMTDate f295751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final GMTDate f295752b;

    public q(@NotNull GMTDate lastModified) {
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        this.f295751a = lastModified;
        this.f295752b = ni.b.e(lastModified);
    }

    public static /* synthetic */ q e(q qVar, GMTDate gMTDate, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gMTDate = qVar.f295751a;
        }
        return qVar.d(gMTDate);
    }

    private final List<GMTDate> i(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.w3((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            GMTDate gMTDateB = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                gMTDateB = io.ktor.http.j0.b((String) it.next());
            } catch (Throwable unused) {
            }
            if (gMTDateB != null) {
                arrayList2.add(gMTDateB);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    @Override // io.ktor.http.content.f0
    public void a(@NotNull w0 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.a(d1.f295782a.X(), io.ktor.http.j0.d(this.f295751a));
    }

    @Override // io.ktor.http.content.f0
    @NotNull
    public g0 b(@NotNull v0 requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        d1 d1Var = d1.f295782a;
        List<String> listB = requestHeaders.b(d1Var.S());
        List<GMTDate> listI = listB != null ? i(listB) : null;
        if (listI != null && !g(listI)) {
            return g0.f295715c;
        }
        List<String> listB2 = requestHeaders.b(d1Var.W());
        List<GMTDate> listI2 = listB2 != null ? i(listB2) : null;
        return (listI2 == null || h(listI2)) ? g0.f295714b : g0.f295716d;
    }

    @NotNull
    public final GMTDate c() {
        return this.f295751a;
    }

    @NotNull
    public final q d(@NotNull GMTDate lastModified) {
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        return new q(lastModified);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f295751a, ((q) obj).f295751a);
    }

    @NotNull
    public final GMTDate f() {
        return this.f295751a;
    }

    public final boolean g(@NotNull List<GMTDate> dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        List<GMTDate> list = dates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.f295752b.compareTo((GMTDate) it.next()) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(@NotNull List<GMTDate> dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        List<GMTDate> list = dates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.f295752b.compareTo((GMTDate) it.next()) > 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f295751a.hashCode();
    }

    @NotNull
    public String toString() {
        return "LastModifiedVersion(lastModified=" + this.f295751a + ')';
    }
}
