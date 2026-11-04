package io.ktor.client.plugins.cookies;

import io.ktor.http.Cookie;
import io.ktor.http.Url;
import io.ktor.http.k2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nConstantCookiesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantCookiesStorage.kt\nio/ktor/client/plugins/cookies/ConstantCookiesStorage\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n11228#2:24\n11563#2,3:25\n774#3:28\n865#3,2:29\n*S KotlinDebug\n*F\n+ 1 ConstantCookiesStorage.kt\nio/ktor/client/plugins/cookies/ConstantCookiesStorage\n*L\n15#1:24\n15#1:25,3\n17#1:28\n17#1:29,2\n*E\n"})
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Cookie> f294718a;

    public e(@NotNull Cookie... cookies) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        ArrayList arrayList = new ArrayList(cookies.length);
        for (Cookie cookie : cookies) {
            arrayList.add(g.b(cookie, new k2(null, null, 0, null, null, null, null, null, false, 511, null).b()));
        }
        this.f294718a = CollectionsKt.toList(arrayList);
    }

    @Override // io.ktor.client.plugins.cookies.f
    @Nullable
    public Object Nd(@NotNull Url url, @NotNull Cookie cookie, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return Unit.f312394a;
    }

    @Override // io.ktor.client.plugins.cookies.f
    @Nullable
    public Object R8(@NotNull Url url, @NotNull kotlin.coroutines.d<? super List<Cookie>> dVar) {
        List<Cookie> list = this.f294718a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (g.c((Cookie) obj, url)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
