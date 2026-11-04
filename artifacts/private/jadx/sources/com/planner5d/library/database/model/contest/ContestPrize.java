package com.planner5d.library.database.model.contest;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.devtodev.core.data.consts.RequestParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = "contests_prizes")
public final class ContestPrize extends Model {

    @Column(name = "contest", onDelete = Column.ForeignKeyAction.CASCADE, onUpdate = Column.ForeignKeyAction.CASCADE)
    @Nullable
    private Contest contest;

    @Column(name = "place")
    @Nullable
    private Integer place;

    @Column(name = "quantity")
    @Nullable
    private Integer quantity;

    @Column(name = "type")
    @Nullable
    private String type;

    @Column(name = RequestParams.UID)
    @Nullable
    private Long uid;

    @m1
    public ContestPrize() {
    }

    public final void A(@Nullable Integer num) {
        this.place = num;
    }

    public final void B(@Nullable Integer num) {
        this.quantity = num;
    }

    public final void C(@Nullable String str) {
        this.type = str;
    }

    public final void D(@Nullable Long l10) {
        this.uid = l10;
    }

    @Override // com.activeandroid.Model
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ContestPrize) {
            ContestPrize contestPrize = (ContestPrize) obj;
            if (Intrinsics.areEqual(this.uid, contestPrize.uid) && Intrinsics.areEqual(this.type, contestPrize.type) && Intrinsics.areEqual(this.place, contestPrize.place) && Intrinsics.areEqual(this.quantity, contestPrize.quantity) && Intrinsics.areEqual(this.contest, contestPrize.contest)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.activeandroid.Model
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Long l10 = this.uid;
        int iHashCode2 = (iHashCode + (l10 != null ? l10.hashCode() : 0)) * 31;
        String str = this.type;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.place;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.quantity;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Contest contest = this.contest;
        return iIntValue2 + (contest != null ? contest.hashCode() : 0);
    }

    @NotNull
    public final ContestPrize s(@NotNull ContestPrize other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.uid = other.uid;
        this.type = other.type;
        this.place = other.place;
        this.quantity = other.quantity;
        this.contest = other.contest;
        return this;
    }

    @Nullable
    public final Contest u() {
        return this.contest;
    }

    @Nullable
    public final Integer v() {
        return this.place;
    }

    @Nullable
    public final Integer w() {
        return this.quantity;
    }

    @Nullable
    public final String x() {
        return this.type;
    }

    @Nullable
    public final Long y() {
        return this.uid;
    }

    public final void z(@Nullable Contest contest) {
        this.contest = contest;
    }
}
