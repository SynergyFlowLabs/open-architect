package kotlinx.serialization;

import java.util.List;
import kotlin.a1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@g
public final class l extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<String> f316076a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull List<String> missingFields, @Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.f316076a = missingFields;
    }

    @NotNull
    public final List<String> a() {
        return this.f316076a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(@NotNull List<String> missingFields, @NotNull String serialName) {
        String str;
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + missingFields.get(0) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull String missingField, @NotNull String serialName) {
        this(CollectionsKt.listOf(missingField), "Field '" + missingField + "' is required for type with serial name '" + serialName + "', but it was missing", null);
        Intrinsics.checkNotNullParameter(missingField, "missingField");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @a1
    public l(@NotNull String missingField) {
        this(CollectionsKt.listOf(missingField), "Field '" + missingField + "' is required, but it was missing", null);
        Intrinsics.checkNotNullParameter(missingField, "missingField");
    }
}
