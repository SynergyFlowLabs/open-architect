package app.rive.runtime.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ChangedInput {

    @NotNull
    private final String name;

    @Nullable
    private final String nestedArtboardPath;

    @NotNull
    private final String stateMachineName;

    @Nullable
    private final Object value;

    public ChangedInput(@NotNull String stateMachineName, @NotNull String name, @Nullable Object obj, @Nullable String str) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(name, "name");
        this.stateMachineName = stateMachineName;
        this.name = name;
        this.value = obj;
        this.nestedArtboardPath = str;
    }

    public static /* synthetic */ ChangedInput copy$default(ChangedInput changedInput, String str, String str2, Object obj, String str3, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = changedInput.stateMachineName;
        }
        if ((i10 & 2) != 0) {
            str2 = changedInput.name;
        }
        if ((i10 & 4) != 0) {
            obj = changedInput.value;
        }
        if ((i10 & 8) != 0) {
            str3 = changedInput.nestedArtboardPath;
        }
        return changedInput.copy(str, str2, obj, str3);
    }

    @NotNull
    public final String component1() {
        return this.stateMachineName;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final Object component3() {
        return this.value;
    }

    @Nullable
    public final String component4() {
        return this.nestedArtboardPath;
    }

    @NotNull
    public final ChangedInput copy(@NotNull String stateMachineName, @NotNull String name, @Nullable Object obj, @Nullable String str) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ChangedInput(stateMachineName, name, obj, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangedInput)) {
            return false;
        }
        ChangedInput changedInput = (ChangedInput) obj;
        return Intrinsics.areEqual(this.stateMachineName, changedInput.stateMachineName) && Intrinsics.areEqual(this.name, changedInput.name) && Intrinsics.areEqual(this.value, changedInput.value) && Intrinsics.areEqual(this.nestedArtboardPath, changedInput.nestedArtboardPath);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNestedArtboardPath() {
        return this.nestedArtboardPath;
    }

    @NotNull
    public final String getStateMachineName() {
        return this.stateMachineName;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((this.stateMachineName.hashCode() * 31) + this.name.hashCode()) * 31;
        Object obj = this.value;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.nestedArtboardPath;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChangedInput(stateMachineName=" + this.stateMachineName + ", name=" + this.name + ", value=" + this.value + ", nestedArtboardPath=" + this.nestedArtboardPath + ')';
    }

    public /* synthetic */ ChangedInput(String str, String str2, Object obj, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : obj, (i10 & 8) != 0 ? null : str3);
    }
}
