package io.intercom.android.sdk.m5.home.data;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.messaging.e;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class Link {
    public static final int $stable = 0;

    @c(e.f.f123534d)
    @NotNull
    private final String label;

    @c("href")
    @NotNull
    private final String url;

    public Link(@NotNull String label, @NotNull String url) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(url, "url");
        this.label = label;
        this.url = url;
    }

    public static /* synthetic */ Link copy$default(Link link, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = link.label;
        }
        if ((i10 & 2) != 0) {
            str2 = link.url;
        }
        return link.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.label;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final Link copy(@NotNull String label, @NotNull String url) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(url, "url");
        return new Link(label, url);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return Intrinsics.areEqual(this.label, link.label) && Intrinsics.areEqual(this.url, link.url);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "Link(label=" + this.label + ", url=" + this.url + ')';
    }
}
