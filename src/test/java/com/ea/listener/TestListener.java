package com.ea.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static final Logger logger = LoggerFactory.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        logger.debug("onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.debug("onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.debug("onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.debug("onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        logger.debug("onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onStart(ITestContext context) {
        logger.debug("TestListener started");
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.debug("TestListener finished");
    }
}
