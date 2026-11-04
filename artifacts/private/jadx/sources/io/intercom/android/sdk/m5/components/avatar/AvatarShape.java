package io.intercom.android.sdk.m5.components.avatar;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum AvatarShape {
    CIRCLE,
    SQUIRCLE;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nAvatarIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarIcon.kt\nio/intercom/android/sdk/m5/components/avatar/AvatarShape$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,454:1\n295#2,2:455\n*S KotlinDebug\n*F\n+ 1 AvatarIcon.kt\nio/intercom/android/sdk/m5/components/avatar/AvatarShape$Companion\n*L\n63#1:455,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AvatarShape fromName(@NotNull String shape) {
            AvatarShape next;
            Intrinsics.checkNotNullParameter(shape, "shape");
            Iterator<AvatarShape> it = AvatarShape.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.N1(next.name(), shape, true));
            AvatarShape avatarShape = next;
            return avatarShape == null ? AvatarShape.CIRCLE : avatarShape;
        }

        private Companion() {
        }
    }

    @NotNull
    public static kotlin.enums.a<AvatarShape> getEntries() {
        return $ENTRIES;
    }
}
