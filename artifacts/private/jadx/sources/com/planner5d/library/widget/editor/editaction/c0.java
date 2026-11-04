package com.planner5d.library.widget.editor.editaction;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemRoom;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class c0 extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f254744e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f254745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.m f254746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f254747d;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nRoomRotateAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomRotateAction.kt\ncom/planner5d/library/widget/editor/editaction/RoomRotateAction$Factory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f254748d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.math.m f254749a = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.math.k f254750b = new com.planner5d.library.math.k();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final ItemLayout f254751c = new ItemLayout();

        @NotNull
        public final c0 a(@NotNull ItemRoom item, float f10, boolean z10) {
            Intrinsics.checkNotNullParameter(item, "item");
            String uid = item.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            com.planner5d.library.math.m rotation = item.getLayoutForRotation(this.f254751c).getRotation(this.f254749a);
            rotation.f180483b = f10;
            Intrinsics.checkNotNullExpressionValue(rotation, "apply(...)");
            com.planner5d.library.math.k position = this.f254751c.getPosition(this.f254750b);
            Intrinsics.checkNotNullExpressionValue(position, "getPosition(...)");
            return new c0(uid, rotation, position, !z10);
        }

        @NotNull
        public final c0 b(@NotNull ItemRoom item, boolean z10) {
            Intrinsics.checkNotNullParameter(item, "item");
            String uid = item.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            com.planner5d.library.math.m rotation = item.getLayoutForRotation(this.f254751c).getRotation(this.f254749a);
            Intrinsics.checkNotNullExpressionValue(rotation, "getRotation(...)");
            com.planner5d.library.math.k position = this.f254751c.getPosition(this.f254750b);
            Intrinsics.checkNotNullExpressionValue(position, "getPosition(...)");
            return new c0(uid, rotation, position, !z10);
        }
    }

    public /* synthetic */ c0(String str, com.planner5d.library.math.m mVar, com.planner5d.library.math.k kVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, mVar, kVar, (i10 & 8) != 0 ? true : z10);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NotNull h provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Item itemA = provider.a(this.f254756a);
        if (itemA instanceof ItemRoom) {
            ItemRoom itemRoom = (ItemRoom) itemA;
            if (!itemRoom.isInRotation()) {
                itemRoom.startRotation();
            }
            itemRoom.rotate(this.f254746c, this.f254747d);
            if (!this.f254745b) {
                itemRoom.endRotation();
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NotNull h provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (provider.f254765c != null) {
            provider.f254769g.m().subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new com.planner5d.library.services.rx.e());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@NotNull String uid, @NotNull com.planner5d.library.math.m rotation, @NotNull com.planner5d.library.math.k rotationCenter, boolean z10) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(rotationCenter, "rotationCenter");
        this.f254745b = z10;
        this.f254746c = new com.planner5d.library.math.m(rotation);
        this.f254747d = new com.planner5d.library.math.k(rotationCenter);
    }
}
