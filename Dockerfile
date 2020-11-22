FROM ubuntu
#install git
RUN apt-get update 
RUN apt-get install -y git
RUN mkdir /sampleTest
RUN cd /sampleTest 
RUN git clone https://github.com/hgraceffa/dockercontainer.git


#Set working directory
WORKDIR /sampleTest
