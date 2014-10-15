package io.bloc.android.blocly;

/**
 * Created by mike on 10/15/14.
 */

import android.app.Application;

public class BloclyApplication extends Application {

// #1
    public static BloclyApplication getSharedInstance() {
        return sharedInstance;
    }

// #2
    public static DataSource getSharedDataSource() {
        return BloclyApplication.getSharedInstance().getDataSource();
    }

    private static BloclyApplication sharedInstance;
    private DataSource dataSource;

// #3
    @Override
    public void onCreate() {
        super.onCreate();
        sharedInstance = this;
        dataSource = new DataSource();
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
