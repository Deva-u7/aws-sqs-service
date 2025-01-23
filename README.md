# AWS SQS Service

This repository is dedicated to demonstrating the use and functionality of Amazon Simple Queue Service (SQS) using Java. It contains various examples and code snippets to help you understand SQS

## Table of Contents

- Overview
- Prerequisites
- Setup
- Usage

## Overview

Amazon Simple Queue Service (SQS) is a fully managed message queuing service that enables you to decouple and scale microservices, distributed systems, and serverless applications.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven
- AWS Account with SQS permissions
- AWS CLI configured with your credentials

## Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/Deva-u7/aws-sqs-service.git
    cd aws-sqs-service
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

3. Configure your AWS credentials:
    ```sh
    aws configure
    ```

4. Set the `cloud.aws.end-point.uri` property in your `application.properties` or `application.yml` file with the appropriate SQS endpoint URL.

## Usage

You can run the examples provided in this repository to interact with AWS SQS. The `MessageService` class contains methods for sending and receiving messages from an SQS queue.

## API Endpoints

### Send Message
- **URL**: `/send-message`
- **Method**: POST
- **Description**: Sends a message to the SQS queue.

### Receive Message
- We have Implemented a Listener who will receive all the messages from the queue.
