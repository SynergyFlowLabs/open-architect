package com.devtodev.analytics.internal.queue;

import com.devtodev.analytics.internal.queue.QueueManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class QueueManager {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final ExecutorService incomingQueue = Executors.newSingleThreadExecutor();
    private static final ExecutorService networkSerialQueue = Executors.newSingleThreadExecutor();
    private static final ExecutorService configQueue = Executors.newSingleThreadExecutor();
    private static final ExecutorService networkFlashQueue = Executors.newSingleThreadExecutor();
    private static final ExecutorService antiCheatQueue = Executors.newSingleThreadExecutor();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runAntiCheatQueue$lambda$4(Function0 block) {
            Intrinsics.checkNotNullParameter(block, "$block");
            block.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runConfigQueue$lambda$2(Function0 block) {
            Intrinsics.checkNotNullParameter(block, "$block");
            block.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runFlashQueue$lambda$3(Function0 block) {
            Intrinsics.checkNotNullParameter(block, "$block");
            block.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runIncoming$lambda$0(Function0 block) {
            Intrinsics.checkNotNullParameter(block, "$block");
            block.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runNetwork$lambda$1(Function0 block) {
            Intrinsics.checkNotNullParameter(block, "$block");
            block.invoke();
        }

        public final void runAntiCheatQueue(@NotNull final Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            QueueManager.antiCheatQueue.execute(new Runnable() { // from class: d5.a
                @Override // java.lang.Runnable
                public final void run() {
                    QueueManager.Companion.runAntiCheatQueue$lambda$4(block);
                }
            });
        }

        public final void runConfigQueue(@NotNull final Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            QueueManager.configQueue.execute(new Runnable() { // from class: d5.c
                @Override // java.lang.Runnable
                public final void run() {
                    QueueManager.Companion.runConfigQueue$lambda$2(block);
                }
            });
        }

        public final void runFlashQueue(@NotNull final Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            QueueManager.networkFlashQueue.execute(new Runnable() { // from class: d5.d
                @Override // java.lang.Runnable
                public final void run() {
                    QueueManager.Companion.runFlashQueue$lambda$3(block);
                }
            });
        }

        public final void runIncoming(@NotNull final Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            QueueManager.incomingQueue.execute(new Runnable() { // from class: d5.b
                @Override // java.lang.Runnable
                public final void run() {
                    QueueManager.Companion.runIncoming$lambda$0(block);
                }
            });
        }

        public final void runNetwork(@NotNull final Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            QueueManager.networkSerialQueue.execute(new Runnable() { // from class: d5.e
                @Override // java.lang.Runnable
                public final void run() {
                    QueueManager.Companion.runNetwork$lambda$1(block);
                }
            });
        }

        private Companion() {
        }
    }
}
