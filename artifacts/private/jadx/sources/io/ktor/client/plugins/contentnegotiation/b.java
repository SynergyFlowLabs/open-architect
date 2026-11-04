package io.ktor.client.plugins.contentnegotiation;

import io.ktor.http.m;
import io.ktor.http.n;
import io.ktor.utils.io.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@r0
public final class b implements io.ktor.serialization.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<kotlin.reflect.d<?>> f294660a = CollectionsKt.toMutableSet(SetsKt.plus((Set) f.a(), (Iterable) e.m()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<a> f294661b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Double f294662c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final io.ktor.serialization.d f294663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final m f294664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final n f294665c;

        public a(@NotNull io.ktor.serialization.d converter, @NotNull m contentTypeToSend, @NotNull n contentTypeMatcher) {
            Intrinsics.checkNotNullParameter(converter, "converter");
            Intrinsics.checkNotNullParameter(contentTypeToSend, "contentTypeToSend");
            Intrinsics.checkNotNullParameter(contentTypeMatcher, "contentTypeMatcher");
            this.f294663a = converter;
            this.f294664b = contentTypeToSend;
            this.f294665c = contentTypeMatcher;
        }

        @NotNull
        public final n a() {
            return this.f294665c;
        }

        @NotNull
        public final m b() {
            return this.f294664b;
        }

        @NotNull
        public final io.ktor.serialization.d c() {
            return this.f294663a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.contentnegotiation.b$b, reason: collision with other inner class name */
    public static final class C2061b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f294666a;

        C2061b(m mVar) {
            this.f294666a = mVar;
        }

        @Override // io.ktor.http.n
        public boolean a(m contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.h(this.f294666a);
        }
    }

    private final n c(m mVar) {
        return new C2061b(mVar);
    }

    @Override // io.ktor.serialization.b
    public <T extends io.ktor.serialization.d> void a(@NotNull m contentType, @NotNull T converter, @NotNull Function1<? super T, Unit> configuration) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        i(contentType, converter, contentType.h(m.a.f295985a.k()) ? g.f294697a : c(contentType), configuration);
    }

    public final void b() {
        this.f294660a.clear();
    }

    @Nullable
    public final Double d() {
        return this.f294662c;
    }

    @NotNull
    public final Set<kotlin.reflect.d<?>> e() {
        return this.f294660a;
    }

    @NotNull
    public final List<a> f() {
        return this.f294661b;
    }

    public final /* synthetic */ <T> void g() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        h(j1.d(Object.class));
    }

    public final void h(@NotNull kotlin.reflect.d<?> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f294660a.add(type);
    }

    public final <T extends io.ktor.serialization.d> void i(@NotNull m contentTypeToSend, @NotNull T converter, @NotNull n contentTypeMatcher, @NotNull Function1<? super T, Unit> configuration) {
        Intrinsics.checkNotNullParameter(contentTypeToSend, "contentTypeToSend");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(contentTypeMatcher, "contentTypeMatcher");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        configuration.invoke(converter);
        this.f294661b.add(new a(converter, contentTypeToSend, contentTypeMatcher));
    }

    public final /* synthetic */ <T> void j() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        k(j1.d(Object.class));
    }

    public final void k(@NotNull kotlin.reflect.d<?> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f294660a.remove(type);
    }

    public final void l(@Nullable Double d10) {
        this.f294662c = d10;
    }
}
