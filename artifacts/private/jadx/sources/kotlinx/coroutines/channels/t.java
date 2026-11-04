package kotlinx.coroutines.channels;

import kotlin.a1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@oj.g
@SourceDebugExtension({"SMAP\nChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/channels/ChannelResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1485:1\n1#2:1486\n*E\n"})
public final class t<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f313893b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final c f313894c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f313895a;

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @Nullable
        public final Throwable f313896a;

        public a(@Nullable Throwable th2) {
            this.f313896a = th2;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.f313896a, ((a) obj).f313896a);
        }

        public int hashCode() {
            Throwable th2 = this.f313896a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.t.c
        @NotNull
        public String toString() {
            return "Closed(" + this.f313896a + ')';
        }
    }

    @k2
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k2
        @NotNull
        public final <E> Object a(@Nullable Throwable th2) {
            return t.c(new a(th2));
        }

        @k2
        @NotNull
        public final <E> Object b() {
            return t.c(t.f313894c);
        }

        @k2
        @NotNull
        public final <E> Object c(E e10) {
            return t.c(e10);
        }

        private b() {
        }
    }

    public static class c {
        @NotNull
        public String toString() {
            return com.facebook.internal.a.f99701v;
        }
    }

    @a1
    private /* synthetic */ t(Object obj) {
        this.f313895a = obj;
    }

    public static final /* synthetic */ t b(Object obj) {
        return new t(obj);
    }

    @a1
    @NotNull
    public static <T> Object c(@Nullable Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        if ((obj2 instanceof t) && Intrinsics.areEqual(obj, ((t) obj2).o())) {
            return true;
        }
        return false;
    }

    public static final boolean e(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    @Nullable
    public static final Throwable f(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f313896a;
        }
        return null;
    }

    @a1
    public static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final T h(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T i(Object obj) throws Throwable {
        if (!(obj instanceof c)) {
            return obj;
        }
        if (!(obj instanceof a)) {
            throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
        }
        Throwable th2 = ((a) obj).f313896a;
        if (th2 != null) {
            throw th2;
        }
        throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
    }

    public static int j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean k(Object obj) {
        return obj instanceof a;
    }

    public static final boolean l(Object obj) {
        return obj instanceof c;
    }

    public static final boolean m(Object obj) {
        return !(obj instanceof c);
    }

    @NotNull
    public static String n(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f313895a, obj);
    }

    public int hashCode() {
        return j(this.f313895a);
    }

    public final /* synthetic */ Object o() {
        return this.f313895a;
    }

    @NotNull
    public String toString() {
        return n(this.f313895a);
    }
}
