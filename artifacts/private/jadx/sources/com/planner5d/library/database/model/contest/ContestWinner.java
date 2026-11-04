package com.planner5d.library.database.model.contest;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = "contests_winners")
public final class ContestWinner extends Model {

    @Column(name = "contest", onDelete = Column.ForeignKeyAction.CASCADE, onUpdate = Column.ForeignKeyAction.CASCADE)
    @Nullable
    private Contest contest;

    @Column(name = "image")
    @Nullable
    private String image;

    @Column(name = "name")
    @Nullable
    private String name;

    @Column(name = "place")
    @Nullable
    private Integer place;

    @Column(name = "rate")
    @Nullable
    private Integer rate;

    @Column(name = "rate_ratio")
    @Nullable
    private Integer rateRatio;

    @Column(name = "userpic")
    @Nullable
    private String userpic;

    @m1
    public ContestWinner() {
    }

    @Nullable
    public final String A() {
        return this.userpic;
    }

    public final void B(@Nullable Contest contest) {
        this.contest = contest;
    }

    public final void C(@Nullable String str) {
        this.image = str;
    }

    public final void D(@Nullable String str) {
        this.name = str;
    }

    public final void E(@Nullable Integer num) {
        this.place = num;
    }

    public final void F(@Nullable Integer num) {
        this.rate = num;
    }

    public final void G(@Nullable Integer num) {
        this.rateRatio = num;
    }

    public final void H(@Nullable String str) {
        this.userpic = str;
    }

    @Override // com.activeandroid.Model
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ContestWinner) {
            ContestWinner contestWinner = (ContestWinner) obj;
            if (Intrinsics.areEqual(this.name, contestWinner.name) && Intrinsics.areEqual(this.userpic, contestWinner.userpic) && Intrinsics.areEqual(this.place, contestWinner.place) && Intrinsics.areEqual(this.rate, contestWinner.rate) && Intrinsics.areEqual(this.rateRatio, contestWinner.rateRatio) && Intrinsics.areEqual(this.image, contestWinner.image) && Intrinsics.areEqual(this.contest, contestWinner.contest)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.activeandroid.Model
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.userpic;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.place;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.rate;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Integer num3 = this.rateRatio;
        int iIntValue3 = (iIntValue2 + (num3 != null ? num3.intValue() : 0)) * 31;
        String str3 = this.image;
        int iHashCode4 = (iIntValue3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Contest contest = this.contest;
        return iHashCode4 + (contest != null ? contest.hashCode() : 0);
    }

    @NotNull
    public final ContestWinner s(@NotNull ContestWinner other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.name = other.name;
        this.userpic = other.userpic;
        this.place = other.place;
        this.rate = other.rate;
        this.rateRatio = other.rateRatio;
        this.image = other.image;
        this.contest = other.contest;
        return this;
    }

    @Nullable
    public final Contest u() {
        return this.contest;
    }

    @Nullable
    public final String v() {
        return this.image;
    }

    @Nullable
    public final String w() {
        return this.name;
    }

    @Nullable
    public final Integer x() {
        return this.place;
    }

    @Nullable
    public final Integer y() {
        return this.rate;
    }

    @Nullable
    public final Integer z() {
        return this.rateRatio;
    }
}
