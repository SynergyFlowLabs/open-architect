package io.sentry.internal.gestures;

import io.sentry.util.y;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    final WeakReference<Object> f305620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    final String f305621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    final String f305622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    final String f305623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    final String f305624e;

    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(@Nullable Object obj, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
        this.f305620a = new WeakReference<>(obj);
        this.f305621b = str;
        this.f305622c = str2;
        this.f305623d = str3;
        this.f305624e = str4;
    }

    @Nullable
    public String a() {
        return this.f305621b;
    }

    @NotNull
    public String b() {
        String str = this.f305622c;
        return str != null ? str : (String) y.c(this.f305623d, "UiElement.tag can't be null");
    }

    @NotNull
    public String c() {
        return this.f305624e;
    }

    @Nullable
    public String d() {
        return this.f305622c;
    }

    @Nullable
    public String e() {
        return this.f305623d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (y.a(this.f305621b, bVar.f305621b) && y.a(this.f305622c, bVar.f305622c) && y.a(this.f305623d, bVar.f305623d)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Object f() {
        return this.f305620a.get();
    }

    public int hashCode() {
        return y.b(this.f305620a, this.f305622c, this.f305623d);
    }
}
