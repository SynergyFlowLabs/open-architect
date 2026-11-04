package androidx.privacysandbox.ads.adservices.topics;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.q.b
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f73680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f73681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final byte[] f73682c;

    public a(@NotNull byte[] encryptedTopic, @NotNull String keyIdentifier, @NotNull byte[] encapsulatedKey) {
        Intrinsics.checkNotNullParameter(encryptedTopic, "encryptedTopic");
        Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        Intrinsics.checkNotNullParameter(encapsulatedKey, "encapsulatedKey");
        this.f73680a = encryptedTopic;
        this.f73681b = keyIdentifier;
        this.f73682c = encapsulatedKey;
    }

    @NotNull
    public final byte[] a() {
        return this.f73682c;
    }

    @NotNull
    public final byte[] b() {
        return this.f73680a;
    }

    @NotNull
    public final String c() {
        return this.f73681b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f73680a, aVar.f73680a) && this.f73681b.contentEquals(aVar.f73681b) && Arrays.equals(this.f73682c, aVar.f73682c);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f73680a)), this.f73681b, Integer.valueOf(Arrays.hashCode(this.f73682c)));
    }

    @NotNull
    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + StringsKt.F1(this.f73680a) + ", KeyIdentifier=" + this.f73681b + ", EncapsulatedKey=" + StringsKt.F1(this.f73682c) + " }");
    }
}
