package com.activeandroid.query;

import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.activeandroid.Cache;
import com.activeandroid.Model;
import com.activeandroid.util.SQLiteUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class From implements Sqlable {
    private String mAlias;
    private String mGroupBy;
    private String mHaving;
    private List<Join> mJoins;
    private String mLimit;
    private String mOffset;
    private String mOrderBy;
    private Sqlable mQueryBase;
    private Class<? extends Model> mType;
    private final StringBuilder mWhere = new StringBuilder();
    private List<Object> mArguments = new ArrayList();

    public From(Class<? extends Model> cls, Sqlable sqlable) {
        this.mType = cls;
        this.mJoins = new ArrayList();
        this.mQueryBase = sqlable;
        this.mJoins = new ArrayList();
    }

    @m1
    private void addFrom(StringBuilder sb2) {
        sb2.append("FROM ");
        sb2.append(Cache.getTableName(this.mType));
        sb2.append(" ");
        if (this.mAlias != null) {
            sb2.append("AS ");
            sb2.append(this.mAlias);
            sb2.append(" ");
        }
    }

    private void addGroupBy(StringBuilder sb2) {
        if (this.mGroupBy != null) {
            sb2.append("GROUP BY ");
            sb2.append(this.mGroupBy);
            sb2.append(" ");
        }
    }

    private void addHaving(StringBuilder sb2) {
        if (this.mHaving != null) {
            sb2.append("HAVING ");
            sb2.append(this.mHaving);
            sb2.append(" ");
        }
    }

    @m1
    private void addJoins(StringBuilder sb2) {
        Iterator<Join> it = this.mJoins.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toSql());
        }
    }

    private void addLimit(StringBuilder sb2) {
        if (this.mLimit != null) {
            sb2.append("LIMIT ");
            sb2.append(this.mLimit);
            sb2.append(" ");
        }
    }

    private void addOffset(StringBuilder sb2) {
        if (this.mOffset != null) {
            sb2.append("OFFSET ");
            sb2.append(this.mOffset);
            sb2.append(" ");
        }
    }

    private void addOrderBy(StringBuilder sb2) {
        if (this.mOrderBy != null) {
            sb2.append("ORDER BY ");
            sb2.append(this.mOrderBy);
            sb2.append(" ");
        }
    }

    private void addWhere(StringBuilder sb2) {
        if (this.mWhere.length() > 0) {
            sb2.append("WHERE ");
            sb2.append((CharSequence) this.mWhere);
            sb2.append(" ");
        }
    }

    private String sqlString(StringBuilder sb2) {
        return sb2.toString().trim();
    }

    void addArguments(Object[] objArr) {
        for (Object objValueOf : objArr) {
            if (objValueOf.getClass() == Boolean.TYPE || objValueOf.getClass() == Boolean.class) {
                objValueOf = Integer.valueOf(objValueOf.equals(Boolean.TRUE) ? 1 : 0);
            }
            this.mArguments.add(objValueOf);
        }
    }

    public From and(String str) {
        return where(str);
    }

    public From as(String str) {
        this.mAlias = str;
        return this;
    }

    @m1
    public int count() {
        return SQLiteUtils.intQuery(toCountSql(), getArguments());
    }

    public Join crossJoin(Class<? extends Model> cls) {
        Join join = new Join(this, cls, Join.JoinType.CROSS);
        this.mJoins.add(join);
        return join;
    }

    @NonNull
    @m1
    public <T extends Model> List<T> execute() {
        List<T> listRawQuery;
        if (this.mQueryBase instanceof Select) {
            listRawQuery = SQLiteUtils.rawQuery(this.mType, toSql(), getArguments());
        } else {
            SQLiteUtils.execSql(toSql(), getArguments());
            listRawQuery = null;
        }
        return listRawQuery != null ? listRawQuery : Collections.EMPTY_LIST;
    }

    @m1
    @p0
    public <T extends Model> T executeSingle() {
        if (this.mQueryBase instanceof Select) {
            limit(1);
            return (T) SQLiteUtils.rawQuerySingle(this.mType, toSql(), getArguments());
        }
        limit(1);
        SQLiteUtils.rawQuerySingle(this.mType, toSql(), getArguments()).delete();
        return null;
    }

    @m1
    public boolean exists() {
        return SQLiteUtils.intQuery(toExistsSql(), getArguments()) != 0;
    }

    public String[] getArguments() {
        int size = this.mArguments.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = this.mArguments.get(i10).toString();
        }
        return strArr;
    }

    public From groupBy(String str) {
        this.mGroupBy = str;
        return this;
    }

    public From having(String str) {
        this.mHaving = str;
        return this;
    }

    public Join innerJoin(Class<? extends Model> cls) {
        Join join = new Join(this, cls, Join.JoinType.INNER);
        this.mJoins.add(join);
        return join;
    }

    public Join join(Class<? extends Model> cls) {
        Join join = new Join(this, cls, null);
        this.mJoins.add(join);
        return join;
    }

    public Join leftJoin(Class<? extends Model> cls) {
        Join join = new Join(this, cls, Join.JoinType.LEFT);
        this.mJoins.add(join);
        return join;
    }

    public From limit(int i10) {
        return limit(String.valueOf(i10));
    }

    public From offset(int i10) {
        return offset(String.valueOf(i10));
    }

    public From or(String str) {
        if (this.mWhere.length() > 0) {
            this.mWhere.append(" OR ");
        }
        this.mWhere.append(str);
        return this;
    }

    public From orderBy(String str) {
        this.mOrderBy = str;
        return this;
    }

    public Join outerJoin(Class<? extends Model> cls) {
        Join join = new Join(this, cls, Join.JoinType.OUTER);
        this.mJoins.add(join);
        return join;
    }

    @m1
    public String toCountSql() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT COUNT(*) ");
        addFrom(sb2);
        addJoins(sb2);
        addWhere(sb2);
        addGroupBy(sb2);
        addHaving(sb2);
        addLimit(sb2);
        addOffset(sb2);
        return sqlString(sb2);
    }

    @m1
    public String toExistsSql() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT EXISTS(SELECT 1 ");
        addFrom(sb2);
        addJoins(sb2);
        addWhere(sb2);
        addGroupBy(sb2);
        addHaving(sb2);
        addLimit(sb2);
        addOffset(sb2);
        sb2.append(")");
        return sqlString(sb2);
    }

    @Override // com.activeandroid.query.Sqlable
    @m1
    public String toSql() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mQueryBase.toSql());
        addFrom(sb2);
        addJoins(sb2);
        addWhere(sb2);
        addGroupBy(sb2);
        addHaving(sb2);
        addOrderBy(sb2);
        addLimit(sb2);
        addOffset(sb2);
        return sqlString(sb2);
    }

    public From where(String str) {
        if (this.mWhere.length() > 0) {
            this.mWhere.append(" AND ");
        }
        this.mWhere.append(str);
        return this;
    }

    public From and(String str, Object... objArr) {
        return where(str, objArr);
    }

    public From limit(String str) {
        this.mLimit = str;
        return this;
    }

    public From offset(String str) {
        this.mOffset = str;
        return this;
    }

    public From or(String str, Object... objArr) {
        or(str).addArguments(objArr);
        return this;
    }

    public From where(String str, Object... objArr) {
        where(str).addArguments(objArr);
        return this;
    }
}
