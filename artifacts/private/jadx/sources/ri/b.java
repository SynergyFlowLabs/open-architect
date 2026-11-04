package ri;

import java.lang.reflect.Type;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.reflect.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<?> f366659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final s f366660b;

    public b(@NotNull kotlin.reflect.d<?> type, @Nullable s sVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f366659a = type;
        this.f366660b = sVar;
    }

    @Nullable
    public final s a() {
        return this.f366660b;
    }

    @NotNull
    public final kotlin.reflect.d<?> b() {
        return this.f366659a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        s sVar = this.f366660b;
        if (sVar == null) {
            b bVar = (b) obj;
            if (bVar.f366660b == null) {
                return Intrinsics.areEqual(this.f366659a, bVar.f366659a);
            }
        }
        return Intrinsics.areEqual(sVar, ((b) obj).f366660b);
    }

    public int hashCode() {
        s sVar = this.f366660b;
        return sVar != null ? sVar.hashCode() : this.f366659a.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TypeInfo(");
        Object obj = this.f366660b;
        if (obj == null) {
            obj = this.f366659a;
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ b(kotlin.reflect.d dVar, s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? null : sVar);
    }

    public /* synthetic */ b(kotlin.reflect.d dVar, Type type, s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, type, (i10 & 4) != 0 ? null : sVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @l(message = "Use constructor without reifiedType parameter.", replaceWith = @b1(expression = "TypeInfo(type, kotlinType)", imports = {}))
    public b(@NotNull kotlin.reflect.d<?> type, @NotNull Type reifiedType, @Nullable s sVar) {
        this(type, sVar);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reifiedType, "reifiedType");
    }
}
