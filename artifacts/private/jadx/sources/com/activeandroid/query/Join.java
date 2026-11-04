package com.activeandroid.query;

import android.text.TextUtils;
import androidx.annotation.m1;
import com.activeandroid.Cache;
import com.activeandroid.Model;

/* JADX INFO: loaded from: classes3.dex */
public final class Join implements Sqlable {
    private String mAlias;
    private From mFrom;
    private JoinType mJoinType;
    private String mOn;
    private Class<? extends Model> mType;
    private String[] mUsing;

    enum JoinType {
        LEFT,
        OUTER,
        INNER,
        CROSS
    }

    Join(From from, Class<? extends Model> cls, JoinType joinType) {
        this.mFrom = from;
        this.mType = cls;
        this.mJoinType = joinType;
    }

    public Join as(String str) {
        this.mAlias = str;
        return this;
    }

    public From on(String str) {
        this.mOn = str;
        return this.mFrom;
    }

    @Override // com.activeandroid.query.Sqlable
    @m1
    public String toSql() {
        StringBuilder sb2 = new StringBuilder();
        JoinType joinType = this.mJoinType;
        if (joinType != null) {
            sb2.append(joinType.toString());
            sb2.append(" ");
        }
        sb2.append("JOIN ");
        sb2.append(Cache.getTableName(this.mType));
        sb2.append(" ");
        if (this.mAlias != null) {
            sb2.append("AS ");
            sb2.append(this.mAlias);
            sb2.append(" ");
        }
        if (this.mOn != null) {
            sb2.append("ON ");
            sb2.append(this.mOn);
            sb2.append(" ");
        } else if (this.mUsing != null) {
            sb2.append("USING (");
            sb2.append(TextUtils.join(", ", this.mUsing));
            sb2.append(") ");
        }
        return sb2.toString();
    }

    public From using(String... strArr) {
        this.mUsing = strArr;
        return this.mFrom;
    }

    public From on(String str, Object... objArr) {
        this.mOn = str;
        this.mFrom.addArguments(objArr);
        return this.mFrom;
    }
}
