package io.ktor.http.cio;

import io.ktor.http.v0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCIOHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOHeaders.kt\nio/ktor/http/cio/CIOHeaders\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
public final class d implements v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q f295480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f295481e;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements Map.Entry<String, List<? extends String>>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f295482a;

        public a(int i10) {
            this.f295482a = i10;
        }

        @Override // java.util.Map.Entry
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            return d.this.f295480d.l(this.f295482a).toString();
        }

        @Override // java.util.Map.Entry
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<String> getValue() {
            return CollectionsKt.listOf(d.this.f295480d.t(this.f295482a).toString());
        }

        public List<String> c(List<String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ List<? extends String> setValue(List<? extends String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(@NotNull q headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f295480d = headers;
        this.f295481e = g0.b(j0.NONE, new Function0() { // from class: io.ktor.http.cio.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.m(this.f295474a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a i(d dVar, int i10) {
        return dVar.new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    private final Set<String> l() {
        return (Set) this.f295481e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedHashSet m(d dVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(dVar.f295480d.h());
        Iterator<Integer> it = dVar.f295480d.m().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(dVar.f295480d.l(it.next().intValue()).toString());
        }
        return linkedHashSet;
    }

    @Override // io.ktor.util.o1
    @Nullable
    public List<String> b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> listC3 = kotlin.sequences.o.c3(kotlin.sequences.o.k1(this.f295480d.g(name), new Function1() { // from class: io.ktor.http.cio.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.j((CharSequence) obj);
            }
        }));
        if (listC3.isEmpty()) {
            return null;
        }
        return listC3;
    }

    @Override // io.ktor.util.o1
    public boolean c() {
        return true;
    }

    @Override // io.ktor.util.o1
    public boolean contains(@NotNull String str) {
        return v0.b.a(this, str);
    }

    @Override // io.ktor.util.o1
    public boolean d(@NotNull String str, @NotNull String str2) {
        return v0.b.b(this, str, str2);
    }

    @Override // io.ktor.util.o1
    public void e(@NotNull Function2<? super String, ? super List<String>, Unit> function2) {
        v0.b.c(this, function2);
    }

    @Override // io.ktor.util.o1
    @Nullable
    public String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        CharSequence charSequenceF = this.f295480d.f(name);
        if (charSequenceF != null) {
            return charSequenceF.toString();
        }
        return null;
    }

    @Override // io.ktor.util.o1
    public boolean isEmpty() {
        return this.f295480d.h() == 0;
    }

    @Override // io.ktor.util.o1
    @NotNull
    public Set<Map.Entry<String, List<String>>> k() {
        return kotlin.sequences.o.f3(kotlin.sequences.o.k1(this.f295480d.m(), new Function1() { // from class: io.ktor.http.cio.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.i(this.f295475a, ((Integer) obj).intValue());
            }
        }));
    }

    @Override // io.ktor.util.o1
    @NotNull
    public Set<String> names() {
        return l();
    }
}
