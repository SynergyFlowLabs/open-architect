package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends androidx.browser.customtabs.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static androidx.browser.customtabs.c f100458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static androidx.browser.customtabs.h f100459d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100457b = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final ReentrantLock f100460e = new ReentrantLock();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d() {
            androidx.browser.customtabs.c cVar;
            d.f100460e.lock();
            if (d.f100459d == null && (cVar = d.f100458c) != null) {
                a aVar = d.f100457b;
                d.f100459d = cVar.k(null);
            }
            d.f100460e.unlock();
        }

        @oj.n
        @Nullable
        public final androidx.browser.customtabs.h b() {
            d.f100460e.lock();
            androidx.browser.customtabs.h hVar = d.f100459d;
            d.f100459d = null;
            d.f100460e.unlock();
            return hVar;
        }

        @oj.n
        public final void c(@NotNull Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            d();
            d.f100460e.lock();
            androidx.browser.customtabs.h hVar = d.f100459d;
            if (hVar != null) {
                hVar.g(url, null, null);
            }
            d.f100460e.unlock();
        }

        private a() {
        }
    }

    @oj.n
    @Nullable
    public static final androidx.browser.customtabs.h h() {
        return f100457b.b();
    }

    @oj.n
    public static final void i(@NotNull Uri uri) {
        f100457b.c(uri);
    }

    @Override // androidx.browser.customtabs.g
    public void b(@NotNull ComponentName name, @NotNull androidx.browser.customtabs.c newClient) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        newClient.n(0L);
        f100458c = newClient;
        f100457b.d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }
}
