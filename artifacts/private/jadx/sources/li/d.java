package li;

import io.ktor.utils.io.o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nServerSentEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSentEvent.kt\nio/ktor/sse/TypedServerSentEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class d<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final T f322691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f322692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f322693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Long f322694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f322695e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d() {
        this(null, null, null, null, null, 31, null);
        int i10 = 6 | 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d i(d dVar, Object obj, String str, String str2, Long l10, String str3, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = dVar.f322691a;
        }
        if ((i10 & 2) != 0) {
            str = dVar.f322692b;
        }
        if ((i10 & 4) != 0) {
            str2 = dVar.f322693c;
        }
        if ((i10 & 8) != 0) {
            l10 = dVar.f322694d;
        }
        if ((i10 & 16) != 0) {
            str3 = dVar.f322695e;
        }
        String str4 = str3;
        String str5 = str2;
        return dVar.h(obj, str, str5, l10, str4);
    }

    @Override // li.c
    @Nullable
    public Long a() {
        return this.f322694d;
    }

    @Override // li.c
    @Nullable
    public String b() {
        return this.f322695e;
    }

    @Nullable
    public final T c() {
        return this.f322691a;
    }

    @Nullable
    public final String d() {
        return this.f322692b;
    }

    @Nullable
    public final String e() {
        return this.f322693c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f322691a, dVar.f322691a) && Intrinsics.areEqual(this.f322692b, dVar.f322692b) && Intrinsics.areEqual(this.f322693c, dVar.f322693c) && Intrinsics.areEqual(this.f322694d, dVar.f322694d) && Intrinsics.areEqual(this.f322695e, dVar.f322695e);
    }

    @Nullable
    public final Long f() {
        return this.f322694d;
    }

    @Nullable
    public final String g() {
        return this.f322695e;
    }

    @Override // li.c
    @Nullable
    public T getData() {
        return this.f322691a;
    }

    @Override // li.c
    @Nullable
    public String getEvent() {
        return this.f322692b;
    }

    @Override // li.c
    @Nullable
    public String getId() {
        return this.f322693c;
    }

    @NotNull
    public final d<T> h(@Nullable T t10, @Nullable String str, @Nullable String str2, @Nullable Long l10, @Nullable String str3) {
        return new d<>(t10, str, str2, l10, str3);
    }

    public int hashCode() {
        T t10 = this.f322691a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        String str = this.f322692b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f322693c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f322694d;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.f322695e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @o0
    @NotNull
    public final String j(@NotNull Function1<? super T, String> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        T data = getData();
        return b.c(data != null ? serializer.invoke(data) : null, getEvent(), getId(), a(), b());
    }

    @NotNull
    public String toString() {
        return "TypedServerSentEvent(data=" + this.f322691a + ", event=" + this.f322692b + ", id=" + this.f322693c + ", retry=" + this.f322694d + ", comments=" + this.f322695e + ')';
    }

    public d(@Nullable T t10, @Nullable String str, @Nullable String str2, @Nullable Long l10, @Nullable String str3) {
        this.f322691a = t10;
        this.f322692b = str;
        this.f322693c = str2;
        this.f322694d = l10;
        this.f322695e = str3;
    }

    public /* synthetic */ d(Object obj, String str, String str2, Long l10, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : str3);
    }
}
