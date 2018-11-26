# scala-to-cfn
This is a way of writing and running/testing type safe 
code locally, and then being able to generate
cloudformation and a suitable jar in the build in order
to run natively in AWS.

Initially the AWS structure could be step functions,
but we could target plain lambdas, SQS queues, and much
more.

The ultimate aim is to get rid of boilerplate and reduce
the amount of JSON processing and cloudformation spread
throughout the code, and also to make sure that any
remaining relationships between parts of the system
are type checked and safe to be run in any supported
situation.

Drawbacks would include
* the writing and maintenance of
the new layer, especailly where the developer already
is effective writing normal cloudformation.
* can't split things into separate jars at present
* modularity/versioning

Other useful resources
* can validate with https://github.com/awslabs/statelint
* this might be useful for the CFN itself
https://github.com/guardian/gaia
