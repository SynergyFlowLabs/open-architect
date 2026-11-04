package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.e1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = "1.3")
@SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f312440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext.Element f312441b;

    @SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12820#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    private static final class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C2251a f312442b = new C2251a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f312443c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final CoroutineContext[] f312444a;

        /* JADX INFO: renamed from: kotlin.coroutines.c$a$a, reason: collision with other inner class name */
        public static final class C2251a {
            public /* synthetic */ C2251a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2251a() {
            }
        }

        public a(@NotNull CoroutineContext[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f312444a = elements;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.f312444a;
            CoroutineContext coroutineContextPlus = h.f312451a;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }

        @NotNull
        public final CoroutineContext[] a() {
            return this.f312444a;
        }
    }

    static final class b extends l0 implements Function2<String, CoroutineContext.Element, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f312445a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, CoroutineContext.Element element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.c$c, reason: collision with other inner class name */
    static final class C2252c extends l0 implements Function2<Unit, CoroutineContext.Element, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CoroutineContext[] f312446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.f f312447b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2252c(CoroutineContext[] coroutineContextArr, i1.f fVar) {
            super(2);
            this.f312446a = coroutineContextArr;
            this.f312447b = fVar;
        }

        public final void c(Unit unit, CoroutineContext.Element element) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(element, "element");
            CoroutineContext[] coroutineContextArr = this.f312446a;
            i1.f fVar = this.f312447b;
            int i10 = fVar.f312749a;
            fVar.f312749a = i10 + 1;
            coroutineContextArr[i10] = element;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit, CoroutineContext.Element element) {
            c(unit, element);
            return Unit.f312394a;
        }
    }

    public c(@NotNull CoroutineContext left, @NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f312440a = left;
        this.f312441b = element;
    }

    private final boolean a(CoroutineContext.Element element) {
        return Intrinsics.areEqual(get(element.getKey()), element);
    }

    private final boolean b(c cVar) {
        while (a(cVar.f312441b)) {
            CoroutineContext coroutineContext = cVar.f312440a;
            if (!(coroutineContext instanceof c)) {
                Intrinsics.checkNotNull(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((CoroutineContext.Element) coroutineContext);
            }
            cVar = (c) coroutineContext;
        }
        return false;
    }

    private final int d() {
        int i10 = 2;
        while (true) {
            CoroutineContext coroutineContext = this.f312440a;
            this = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (this == null) {
                return i10;
            }
            i10++;
        }
    }

    private final Object writeReplace() {
        int iD = d();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[iD];
        i1.f fVar = new i1.f();
        fold(Unit.f312394a, new C2252c(coroutineContextArr, fVar));
        if (fVar.f312749a == iD) {
            return new a(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.d() != d() || !cVar.b(this)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke((Object) this.f312440a.fold(r10, operation), this.f312441b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        while (true) {
            E e10 = (E) this.f312441b.get(key);
            if (e10 != null) {
                return e10;
            }
            CoroutineContext coroutineContext = this.f312440a;
            if (!(coroutineContext instanceof c)) {
                return (E) coroutineContext.get(key);
            }
            this = (c) coroutineContext;
        }
    }

    public int hashCode() {
        return this.f312440a.hashCode() + this.f312441b.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f312441b.get(key) != null) {
            return this.f312440a;
        }
        CoroutineContext coroutineContextMinusKey = this.f312440a.minusKey(key);
        if (coroutineContextMinusKey == this.f312440a) {
            return this;
        }
        return coroutineContextMinusKey == h.f312451a ? this.f312441b : new c(coroutineContextMinusKey, this.f312441b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.a.a(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + ((String) fold("", b.f312445a)) + AbstractJsonLexerKt.END_LIST;
    }
}
