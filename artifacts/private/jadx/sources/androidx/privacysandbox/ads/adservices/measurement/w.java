package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.q.e
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Uri> f73672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final InputEvent f73673b;

    @SourceDebugExtension({"SMAP\nSourceRegistrationRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceRegistrationRequest.kt\nandroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<Uri> f73674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private InputEvent f73675b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull List<? extends Uri> registrationUris) {
            Intrinsics.checkNotNullParameter(registrationUris, "registrationUris");
            this.f73674a = registrationUris;
        }

        @NotNull
        public final w a() {
            return new w(this.f73674a, this.f73675b);
        }

        @NotNull
        public final a b(@NotNull InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
            this.f73675b = inputEvent;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull List<? extends Uri> registrationUris, @Nullable InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(registrationUris, "registrationUris");
        this.f73672a = registrationUris;
        this.f73673b = inputEvent;
    }

    @Nullable
    public final InputEvent a() {
        return this.f73673b;
    }

    @NotNull
    public final List<Uri> b() {
        return this.f73672a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.f73672a, wVar.f73672a) && Intrinsics.areEqual(this.f73673b, wVar.f73673b);
    }

    public int hashCode() {
        int iHashCode = this.f73672a.hashCode();
        InputEvent inputEvent = this.f73673b;
        if (inputEvent != null) {
            iHashCode = (iHashCode * 31) + inputEvent.hashCode();
        }
        return iHashCode;
    }

    @NotNull
    public String toString() {
        return "AppSourcesRegistrationRequest { " + ("RegistrationUris=[" + this.f73672a + "], InputEvent=" + this.f73673b) + " }";
    }

    public /* synthetic */ w(List list, InputEvent inputEvent, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : inputEvent);
    }
}
