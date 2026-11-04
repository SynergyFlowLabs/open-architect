package io.customer.messagingpush.processor;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.LinkedBlockingDeque;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@rg.a
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1959a f288458a = C1959a.f288460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f288459b = 10;

    /* JADX INFO: renamed from: io.customer.messagingpush.processor.a$a, reason: collision with other inner class name */
    public static final class C1959a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f288461b = 10;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C1959a f288460a = new C1959a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final LinkedBlockingDeque<String> f288462c = new LinkedBlockingDeque<>(10);

        private C1959a() {
        }

        @NotNull
        public final LinkedBlockingDeque<String> a() {
            return f288462c;
        }
    }

    void a(@NotNull Context context, @NotNull Intent intent);

    void b(@NotNull String str, @NotNull String str2);

    void c(@NotNull Intent intent);
}
