package com.planner5d.library.database.model.contest;

import androidx.annotation.m1;
import androidx.media3.exoplayer.offline.u;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.planner5d.library.database.model.SynchronizedModel;
import com.planner5d.library.model.a0;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = "contests")
@SourceDebugExtension({"SMAP\nContest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Contest.kt\ncom/planner5d/library/database/model/contest/Contest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public final class Contest extends SynchronizedModel {

    @Column(name = "active")
    private boolean active;

    @Column(name = "catalog_id")
    @Nullable
    private Long catalogId;

    @Column(name = "date_end")
    @Nullable
    private Date endDate;

    @Column(name = "image")
    @Nullable
    private String image;

    @Column(name = "name")
    @Nullable
    private a0 name;

    @Column(name = "works")
    private int numberOfWorks;

    @Column(name = "rate_ratio")
    @Nullable
    private Integer rateRatio;

    @Column(name = u.f64563p0)
    @Nullable
    private a0 requirements;

    @Column(name = "date_start")
    @Nullable
    private Date startDate;

    @Column(name = "date_voting_start")
    @Nullable
    private Date startVotingDate;

    @Column(name = "user_place")
    @Nullable
    private Integer userPlace;

    @Column(name = "user_rate")
    @Nullable
    private Integer userRate;

    @m1
    public Contest() {
    }

    @Nullable
    public final String A() {
        return this.image;
    }

    @Nullable
    public final String B() {
        return this.uid;
    }

    @Nullable
    public final a0 C() {
        return this.name;
    }

    public final int D() {
        return this.numberOfWorks;
    }

    @Nullable
    public final Integer E() {
        return this.rateRatio;
    }

    public final long F(@NotNull Date serverTime) {
        Intrinsics.checkNotNullParameter(serverTime, "serverTime");
        Date date = this.endDate;
        if (date != null) {
            return r.v(date.getTime() - serverTime.getTime(), 0L);
        }
        return 0L;
    }

    @Nullable
    public final a0 G() {
        return this.requirements;
    }

    @Nullable
    public final Date H() {
        return this.startDate;
    }

    @Nullable
    public final Date I() {
        return this.startVotingDate;
    }

    public final long J(@NotNull Date serverTime) {
        Intrinsics.checkNotNullParameter(serverTime, "serverTime");
        Date date = this.startVotingDate;
        if (date != null) {
            return r.v(date.getTime() - serverTime.getTime(), 0L);
        }
        return 0L;
    }

    @Nullable
    public final Integer K() {
        return this.userPlace;
    }

    @Nullable
    public final Integer L() {
        return this.userRate;
    }

    public final boolean M(@NotNull Date serverTime) {
        boolean zAreEqual;
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(serverTime, "serverTime");
        if (this.active) {
            Date date = this.startDate;
            if (date != null) {
                Date date2 = this.endDate;
                if (date2 != null) {
                    boolValueOf = Boolean.valueOf(date.getTime() <= serverTime.getTime() && date2.getTime() >= serverTime.getTime());
                } else {
                    boolValueOf = null;
                }
                zAreEqual = Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                return true;
            }
        }
        return false;
    }

    public final boolean N(@NotNull Date serverTime) {
        Intrinsics.checkNotNullParameter(serverTime, "serverTime");
        Date date = this.endDate;
        return date != null && serverTime.getTime() > date.getTime();
    }

    public final boolean O(@NotNull Date serverTime) {
        Intrinsics.checkNotNullParameter(serverTime, "serverTime");
        return this.active && N(serverTime);
    }

    public final boolean P(@NotNull Date serverTime) {
        Date date;
        Intrinsics.checkNotNullParameter(serverTime, "serverTime");
        return M(serverTime) && (date = this.startVotingDate) != null && serverTime.getTime() >= date.getTime();
    }

    @m1
    @NotNull
    public final List<ContestPrize> Q() {
        List<ContestPrize> many = getMany(ContestPrize.class, "contest");
        Intrinsics.checkNotNullExpressionValue(many, "getMany(...)");
        return many;
    }

    public final void R(boolean z10) {
        this.active = z10;
    }

    public final void S(@Nullable Long l10) {
        this.catalogId = l10;
    }

    public final void T(@Nullable Date date) {
        this.endDate = date;
    }

    public final void U(@Nullable String str) {
        this.image = str;
    }

    public final void V(@Nullable a0 a0Var) {
        this.name = a0Var;
    }

    public final void W(int i10) {
        this.numberOfWorks = i10;
    }

    public final void X(@Nullable Integer num) {
        this.rateRatio = num;
    }

    public final void Y(@Nullable a0 a0Var) {
        this.requirements = a0Var;
    }

    public final void Z(@Nullable Date date) {
        this.startDate = date;
    }

    public final void a0(@Nullable Date date) {
        this.startVotingDate = date;
    }

    public final void b0(@Nullable Integer num) {
        this.userPlace = num;
    }

    public final void c0(@Nullable Integer num) {
        this.userRate = num;
    }

    @m1
    @NotNull
    public final List<ContestWinner> d0() {
        List<ContestWinner> many = getMany(ContestWinner.class, "contest");
        Intrinsics.checkNotNullExpressionValue(many, "getMany(...)");
        return many;
    }

    public final boolean x() {
        return this.active;
    }

    @Nullable
    public final Long y() {
        return this.catalogId;
    }

    @Nullable
    public final Date z() {
        return this.endDate;
    }
}
