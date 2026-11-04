package io.ktor.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nio/ktor/util/AttributeKey\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,147:1\n1#2:148\n65#3,18:149\n*S KotlinDebug\n*F\n+ 1 Attributes.kt\nio/ktor/util/AttributeKey\n*L\n34#1:149,18\n*E\n"})
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ri.b f296496b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public a(@NotNull String name) {
        this(name, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    private final ri.b b() {
        return this.f296496b;
    }

    public static /* synthetic */ a d(a aVar, String str, ri.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f296495a;
        }
        if ((i10 & 2) != 0) {
            bVar = aVar.f296496b;
        }
        return aVar.c(str, bVar);
    }

    @NotNull
    public final String a() {
        return this.f296495a;
    }

    @NotNull
    public final a<T> c(@NotNull String name, @NotNull ri.b type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new a<>(name, type);
    }

    @NotNull
    public final String e() {
        return this.f296495a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f296495a, aVar.f296495a) && Intrinsics.areEqual(this.f296496b, aVar.f296496b);
    }

    public int hashCode() {
        return (this.f296495a.hashCode() * 31) + this.f296496b.hashCode();
    }

    @NotNull
    public String toString() {
        return "AttributeKey: " + this.f296495a;
    }

    @oj.j
    public a(@NotNull String name, @NotNull ri.b type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f296495a = name;
        this.f296496b = type;
        if (StringsKt.w3(name)) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public /* synthetic */ a(String str, ri.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        kotlin.reflect.s sVarA;
        if ((i10 & 2) != 0) {
            kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(Object.class);
            try {
                sVarA = kotlin.jvm.internal.j1.A(Object.class);
            } catch (Throwable unused) {
                sVarA = null;
            }
            bVar = new ri.b(dVarD, sVarA);
        }
        this(str, bVar);
    }
}
